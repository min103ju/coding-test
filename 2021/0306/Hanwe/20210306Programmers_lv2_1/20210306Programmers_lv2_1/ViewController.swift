//
//  ViewController.swift
//  20210306Programmers_lv2_1
//
//  Created by hanwe on 2021/03/06.
//

import Cocoa

class ViewController: NSViewController {

    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
        print("result:\(solution(8, 12) /*80*/)")
    }
    
    func solution(_ w:Int, _ h:Int) -> Int64{
        let gcdValue = gcd(w,h)
        
        return Int64((w * h) - (w + h - gcdValue))
    }
    
    func gcd(_ min: Int, _ max: Int) -> Int {
        let remain = min % max
        if remain == 0 {
            return max
        }
        else {
            return gcd(max, remain)
        }
    }


}

