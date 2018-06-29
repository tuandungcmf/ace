package jp.co.ace.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.co.ace.entities.HouseDetail;
import jp.co.ace.form.HouseDetailForm;
import jp.co.ace.service.HouseDetailService;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("houseDetail")
@SessionAttributes({"houseDetailForm"})
@Slf4j
public class HouseDetailController{

	@Autowired
	private HouseDetailService houseDetailService;

	@Autowired
	private MessageSource messageSourcce;

	@ModelAttribute
	public HouseDetailForm createHouseDetailForm(){
		return new HouseDetailForm();
	}

	@RequestMapping("list")
	public String list(Model model){
		return "houseDetail/houseDetailList";
	}

	@RequestMapping("detail")
	public String detail(@RequestParam Integer houseDetailId, Model model) {
		HouseDetail houseDetail = houseDetailService.getHouseDetailById(houseDetailId);
		model.addAttribute("houseDetail",houseDetail);
		return "houseDetail/houseDetailDetail";
	}

	@RequestMapping("input")
	public String input(@ModelAttribute HouseDetailForm houseDetailForm, Model model
			, @RequestParam(required=false) Boolean isBack){

		if (isBack == null){
			model.addAttribute("houseDetailForm", createHouseDetailForm());
		}

		return "houseDetail/houseDetailInput";

	}

	@PostMapping("inputConfirm")
	public String inputConfirm(@Valid @ModelAttribute HouseDetailForm houseDetailForm,BindingResult bindingResult){

		if(bindingResult.hasErrors()){
			return "houseDetail/houseDetailInput";
		}

		return "houseDetail/houseDetailInputConfirm";
	}

	@PostMapping("insert")
	public String insert(@ModelAttribute HouseDetailForm houseDetailForm
			, SessionStatus status, RedirectAttributes attributes){

		HouseDetail houseDetail = new HouseDetail();
		houseDetail.setHouseName(houseDetailForm.getHouseName());
		houseDetail.setHouseDetail(houseDetailForm.getHouseDetail());
		houseDetail.setHousePrice(houseDetailForm.getHousePrice());
		houseDetail.setHouseAddress(houseDetailForm.getHouseAddress());
		houseDetail.setCreateDate(houseDetailForm.getCreateDate());
		houseDetail.setUpdateDate(houseDetailForm.getUpdateDate());
		houseDetail.setAccountId(houseDetailForm.getAccountId());
		houseDetail.setCategoryId(houseDetailForm.getCategoryId());

		houseDetailService.insert(houseDetail);

		status.setComplete();
		attributes.addFlashAttribute("msg", messageSourcce.getMessage("info.entryComplete",null, Locale.getDefault()));

		return "redirect:list";
	}

	@RequestMapping("edit")
	public String edit(@ModelAttribute HouseDetailForm houseDetailForm, @RequestParam Integer houseDetailId
			, Model model, @RequestParam(required=false) Boolean isBack) {

		HouseDetail houseDetail = houseDetailService.getHouseDetailById(houseDetailId);

		if(isBack == null){
			houseDetailForm = createHouseDetailForm();
			houseDetailForm.setHouseName(houseDetail.getHouseName());
			houseDetailForm.setHouseDetail(houseDetail.getHouseDetail());
			houseDetailForm.setHousePrice(houseDetail.getHousePrice());
			houseDetailForm.setHouseAddress(houseDetail.getHouseAddress());
			houseDetailForm.setCreateDate(houseDetail.getCreateDate());
			houseDetailForm.setUpdateDate(houseDetail.getUpdateDate());
			houseDetailForm.setAccountId(houseDetail.getAccountId());
			houseDetailForm.setCategoryId(houseDetail.getCategoryId());
			houseDetailForm.setExclusive(houseDetail.getExclusive());
		}

		model.addAttribute("houseDetailId",houseDetailId);
		model.addAttribute("houseDetailForm", houseDetailForm);

		return "houseDetail/houseDetailEdit";
	}

	@PostMapping("editConfirm")
	public String editConfirm(@Valid @ModelAttribute HouseDetailForm houseDetailForm, BindingResult bindingResult
			, @RequestParam Integer houseDetailId, Model model){

		model.addAttribute("houseDetailId",houseDetailId);

		if(bindingResult.hasErrors()){
			return "houseDetail/houseDetailEdit";
		}

		return "houseDetail/houseDetailEditConfirm";
	}

	@PostMapping("update")
	public String update(@ModelAttribute HouseDetailForm houseDetailForm, @RequestParam Integer houseDetailId
			, Model model, SessionStatus status, RedirectAttributes attributes){

		HouseDetail houseDetail = houseDetailService.getHouseDetailById(houseDetailId);
		houseDetail.setHouseName(houseDetailForm.getHouseName());
		houseDetail.setHouseDetail(houseDetailForm.getHouseDetail());
		houseDetail.setHousePrice(houseDetailForm.getHousePrice());
		houseDetail.setHouseAddress(houseDetailForm.getHouseAddress());
		houseDetail.setCreateDate(houseDetailForm.getCreateDate());
		houseDetail.setUpdateDate(houseDetailForm.getUpdateDate());
		houseDetail.setAccountId(houseDetailForm.getAccountId());
		houseDetail.setCategoryId(houseDetailForm.getCategoryId());
		houseDetail.setExclusive(houseDetailForm.getExclusive());

		int cnt = houseDetailService.update(houseDetail);

		if(cnt == 0){
			attributes.addFlashAttribute("msg", messageSourcce.getMessage("error.exclusive",null, Locale.getDefault()));
			return "redirect:/houseDetail/list";
		}

		status.setComplete();
		attributes.addFlashAttribute("msg", messageSourcce.getMessage("info.updateComplete",null, Locale.getDefault()));

		return "redirect:/houseDetail/list";
	}

	@RequestMapping("deleteConfirm")
	public String deleteConfirm(@RequestParam Integer houseDetailId, Model model){
		HouseDetail houseDetail = houseDetailService.getHouseDetailById(houseDetailId);
		model.addAttribute("houseDetail",houseDetail);
		return "houseDetail/houseDetailDelete";
	}

	@PostMapping("delete")
	public String delete(@RequestParam Integer houseDetailId, Model model, RedirectAttributes attributes){
		houseDetailService.delete(houseDetailId);
		attributes.addFlashAttribute("msg", messageSourcce.getMessage("info.deleteComplete",null, Locale.getDefault()));
		return "redirect:/houseDetail/list";
	}
}