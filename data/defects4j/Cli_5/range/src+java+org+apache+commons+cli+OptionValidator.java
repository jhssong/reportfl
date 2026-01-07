{
  "filepath": "/tmp/Cli-5b/src/java/org/apache/commons/cli/OptionValidator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionValidator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 101,
      "comment": "\n * Validates an Option string.\n *\n * @author John Keyes ( john at integralsource.com )\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionValidator.validateOption(java.lang.String)",
      "begin_line": 41,
      "end_line": 77,
      "comment": "\n     * \u003cp\u003eValidates whether \u003ccode\u003eopt\u003c/code\u003e is a permissable Option\n     * shortOpt.  The rules that specify if the \u003ccode\u003eopt\u003c/code\u003e\n     * is valid are:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003eopt\u003c/code\u003e is not NULL\u003c/li\u003e\n     *  \u003cli\u003ea single character \u003ccode\u003eopt\u003c/code\u003e that is either\n     *  \u0027 \u0027(special case), \u0027?\u0027, \u0027@\u0027 or a letter\u003c/li\u003e\n     *  \u003cli\u003ea multi character \u003ccode\u003eopt\u003c/code\u003e that only contains\n     *  letters.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param opt The option string to validate\n     * @throws IllegalArgumentException if the Option is not valid.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 76,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionValidator.isValidOpt(char)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n     * \u003cp\u003eReturns whether the specified character is a valid Option.\u003c/p\u003e\n     *\n     * @param c the option to validate\n     * @return true if \u003ccode\u003ec\u003c/code\u003e is a letter, \u0027 \u0027, \u0027?\u0027 or \u0027@\u0027, \n     * otherwise false.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionValidator.isValidChar(char)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\n     * \u003cp\u003eReturns whether the specified character is a valid character.\u003c/p\u003e\n     *\n     * @param c the character to validate\n     * @return true if \u003ccode\u003ec\u003c/code\u003e is a letter.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 49)"
      ]
    }
  ]
}