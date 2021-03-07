//
//  ViewController.swift
//  20210307Programmers_lv1_1
//
//  Created by hanwe on 2021/03/07.
//
//https://programmers.co.kr/learn/courses/30/lessons/72410

import Cocoa

class ViewController: NSViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        print("result:\(solution("...!@BaT#*..y.abcdefghijklm"))")
        print("result:\(solution("z-+.^."))")
        print("result:\(solution("=.="))")
        print("result:\(solution("123_.def"))")
        print("result:\(solution("abcdefghijklmn.p"))")
    }
    
    func solution(_ new_id:String) -> String {
        return new_id.step1().step2().step3().step4().step5().step6().step7()
    }
}

extension String {
    
    func step1() -> String { //1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        return self.lowercased()
    }
    
    func step2() -> String { //2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다. new_id에 나타날 수 있는 특수문자는 -_.~!@#$%^&*()=+[{]}:?,<>/ 로 한정됩니다.
        var returnValue = self
        returnValue = returnValue.replacingOccurrences(of: "~", with:"")
        returnValue = returnValue.replacingOccurrences(of: "!", with:"")
        returnValue = returnValue.replacingOccurrences(of: "@", with:"")
        returnValue = returnValue.replacingOccurrences(of: "#", with:"")
        returnValue = returnValue.replacingOccurrences(of: "$", with:"")
        returnValue = returnValue.replacingOccurrences(of: "%", with:"")
        returnValue = returnValue.replacingOccurrences(of: "^", with:"")
        returnValue = returnValue.replacingOccurrences(of: "&", with:"")
        returnValue = returnValue.replacingOccurrences(of: "*", with:"")
        returnValue = returnValue.replacingOccurrences(of: "(", with:"")
        returnValue = returnValue.replacingOccurrences(of: ")", with:"")
        returnValue = returnValue.replacingOccurrences(of: "=", with:"")
        returnValue = returnValue.replacingOccurrences(of: "+", with:"")
        returnValue = returnValue.replacingOccurrences(of: "[", with:"")
        returnValue = returnValue.replacingOccurrences(of: "{", with:"")
        returnValue = returnValue.replacingOccurrences(of: "]", with:"")
        returnValue = returnValue.replacingOccurrences(of: "}", with:"")
        returnValue = returnValue.replacingOccurrences(of: ":", with:"")
        returnValue = returnValue.replacingOccurrences(of: "?", with:"")
        returnValue = returnValue.replacingOccurrences(of: ",", with:"")
        returnValue = returnValue.replacingOccurrences(of: "<", with:"")
        returnValue = returnValue.replacingOccurrences(of: ">", with:"")
        returnValue = returnValue.replacingOccurrences(of: "/", with:"")
        return returnValue
    }
    
    func step3() -> String { //3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        var returnValue = self
        while true {
            if returnValue.contains("..") {
                returnValue = returnValue.replacingOccurrences(of: "..", with:".")
            }
            else {
                break
            }
        }
        return returnValue
    }
    
    func step4() -> String { //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        var returnValue = self
        while true {
            if returnValue.first == "." {
                returnValue.removeFirst()
            }
            else {
                break
            }
        }
        while true {
            if returnValue.last == "." {
                returnValue.removeLast()
            }
            else {
                break
            }
        }
        return returnValue
    }
    
    func step5() -> String { //5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if self == "" {
            return "a"
        }
        else {
            return self
        }
    }
    func step6() -> String {//6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다. 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        var returnValue = self
        returnValue = returnValue.cut15CntString().step4()
        return returnValue
    }
    
    func step7() -> String { //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        var returnValue = self
        if returnValue.count < 3 {
            while true {
                returnValue = returnValue + String(returnValue.last ?? "a")
                if returnValue.count > 2 {
                    break
                }
            }
        }
        return returnValue
    }
    
    func cut15CntString() -> String { // 앞 문자열 15개남 남기고 다 지운다.
        var returnValue = self
        if self.count > 15 {
            let firstIndex = returnValue.index(returnValue.startIndex, offsetBy: 0)
            let lastIndex = returnValue.index(returnValue.startIndex, offsetBy: 15)
            returnValue = String(returnValue[firstIndex..<lastIndex])
        }
        return returnValue
    }
}

