package sco

import io.quarkiverse.mcp.server.Tool
import io.quarkiverse.mcp.server.ToolArg

class MathTool {

	@Tool(description = "Get sum of two numbers.")
	fun getSum(
		@ToolArg(description = "First number") a: Int,
		@ToolArg(description = "Second number") b: Int,
	): Integer {
		return Integer(a + b)
	}

	@Tool(description = "Get sum of list of integers.")
	fun getListSum(
		@ToolArg(description = "array of integers")
		list: IntArray
	): Integer {
		return Integer(list.sum())
	}
}
