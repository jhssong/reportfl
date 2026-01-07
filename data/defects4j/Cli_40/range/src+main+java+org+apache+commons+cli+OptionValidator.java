{
  "filepath": "/tmp/Cli-40b/src/main/java/org/apache/commons/cli/OptionValidator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionValidator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 98,
      "comment": "\n * Validates an Option string.\n *\n * @since 1.1\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionValidator.validateOption(java.lang.String)",
      "begin_line": 44,
      "end_line": 75,
      "comment": "\n     * Validates whether \u003ccode\u003eopt\u003c/code\u003e is a permissible Option\n     * shortOpt.  The rules that specify if the \u003ccode\u003eopt\u003c/code\u003e\n     * is valid are:\n     *\n     * \u003cul\u003e\n     *  \u003cli\u003ea single character \u003ccode\u003eopt\u003c/code\u003e that is either\n     *  \u0027 \u0027(special case), \u0027?\u0027, \u0027@\u0027 or a letter\u003c/li\u003e\n     *  \u003cli\u003ea multi character \u003ccode\u003eopt\u003c/code\u003e that only contains\n     *  letters.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * In case {@code opt} is {@code null} no further validation is performed.\n     *\n     * @param opt The option string to validate, may be null\n     * @throws IllegalArgumentException if the Option is not valid.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 50,col 9)",
        "(line 53,col 9)-(line 74,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionValidator.isValidOpt(char)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * Returns whether the specified character is a valid Option.\n     *\n     * @param c the option to validate\n     * @return true if \u003ccode\u003ec\u003c/code\u003e is a letter, \u0027?\u0027 or \u0027@\u0027, otherwise false.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionValidator.isValidChar(char)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\n     * Returns whether the specified character is a valid character.\n     *\n     * @param c the character to validate\n     * @return true if \u003ccode\u003ec\u003c/code\u003e is a letter.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 49)"
      ]
    }
  ]
}