//
//  ViewController.swift
//  20210306Programmers_lv1_1
//
//  Created by hanwe on 2021/03/06.
//

//https://programmers.co.kr/learn/courses/30/lessons/68644
import Cocoa

class ViewController: NSViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        print("result:\(solution([2,1,3,4,1]))")

    }

    func solution(_ numbers:[Int]) -> [Int] {
        var sumSet: Set<Int> = Set()
        for i in 0..<numbers.count-1 {
            for j in i+1..<numbers.count {
                sumSet.insert(numbers[i] + numbers[j])
            }
        }
        return sumSet.sorted{ $0 < $1 }
    }
}

