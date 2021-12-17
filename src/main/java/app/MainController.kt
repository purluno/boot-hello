package app

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
open class MainController {

    @GetMapping("hello")
    open fun hello(): Map<String, Any?> {
        return mapOf("hello" to "world")
    }

    @GetMapping("sum")
    open fun sum(@RequestParam values: List<Long>): Map<String, Any?> {
        return mapOf("sum" to values.sum(), "values" to values)
    }

}
