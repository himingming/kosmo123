package kr.co.kosmo.mvc.controller.chart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/mychart")
public class ChartController {
	
	@GetMapping(value = "/deptJsonDemo")
	public String deptJson(){
		return "chart/deptJsonDemo";
	}
	
	@GetMapping(value = "/barchart")
	public ModelAndView bar() {
		ModelAndView mav = new ModelAndView("chart/barChart");
		return mav;
	}
	
	@GetMapping(value = "/donutchart")
	public ModelAndView donut() {
		ModelAndView mav = new ModelAndView("chart/donutChart");
		return mav;
	}
	
	
	@GetMapping(value = "/ajaxchart")
	public String ajax() {
		return "chart/ajaxChart";
		
	}
	
	@GetMapping(value = "/ajaxchartTitle")
	public String ajaxTitle(Model model, int num) {
		model.addAttribute("num", num);
		return "chart/ajaxChartTitle";
		
	}
	
	@GetMapping(value = "/memberListJsonDemo")
	public String memberListJson() {
		return "chart/memberListJsonDemo";
	}
}
