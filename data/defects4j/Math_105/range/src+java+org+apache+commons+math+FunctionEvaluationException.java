{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/FunctionEvaluationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionEvaluationException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 26,
      "end_line": 81,
      "comment": "\n * Exeption thrown when an error occurs evaluating a function.\n * \u003cp\u003e\n * Maintains an \u003ccode\u003eargument\u003c/code\u003e property holding the input value that\n * caused the function evaluation to fail.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "argument"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Argument causing function evaluation failure "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Construct an exception indicating the argument value\n     * that caused the function evaluation to fail.  Generates an exception\n     * message of the form \"Evaluation failed for argument \u003d \" + argument.\n     * \n     * @param argument  the failing function argument \n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double, java.lang.String)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Construct an exception using the given argument and message\n     * text.  The message text of the exception will start with \n     * \u003ccode\u003emessage\u003c/code\u003e and be followed by \n     * \" Evaluation failed for argument \u003d \" + argument.\n     * \n     * @param argument  the failing function argument \n     * @param message  the exception message text\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double, java.lang.String, java.lang.Throwable)",
      "begin_line": 67,
      "end_line": 71,
      "comment": "\n     * Construct an exception with the given argument, message and root cause.\n     * The message text of the exception will start with  \u003ccode\u003emessage\u003c/code\u003e\n     * and be followed by \" Evaluation failed for argument \u003d \" + argument.\n     * \n     * @param argument  the failing function argument \n     * @param message descriptive error message\n     * @param cause root cause.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 78)",
        "(line 70,col 9)-(line 70,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.FunctionEvaluationException.getArgument()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Returns the function argument that caused this exception.\n     * \n     * @return  argument that caused function evaluation to fail\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 29)"
      ]
    }
  ]
}