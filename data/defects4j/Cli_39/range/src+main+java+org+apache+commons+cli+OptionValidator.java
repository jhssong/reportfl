{
  "filepath": "/tmp/Cli-39b/src/main/java/org/apache/commons/cli/OptionValidator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionValidator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 99,
      "comment": "\n * Validates an Option string.\n *\n * @version $Id$\n * @since 1.1\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionValidator.validateOption(java.lang.String)",
      "begin_line": 45,
      "end_line": 76,
      "comment": "\n     * Validates whether \u003ccode\u003eopt\u003c/code\u003e is a permissible Option\n     * shortOpt.  The rules that specify if the \u003ccode\u003eopt\u003c/code\u003e\n     * is valid are:\n     *\n     * \u003cul\u003e\n     *  \u003cli\u003ea single character \u003ccode\u003eopt\u003c/code\u003e that is either\n     *  \u0027 \u0027(special case), \u0027?\u0027, \u0027@\u0027 or a letter\u003c/li\u003e\n     *  \u003cli\u003ea multi character \u003ccode\u003eopt\u003c/code\u003e that only contains\n     *  letters.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * In case {@code opt} is {@code null} no further validation is performed.\n     *\n     * @param opt The option string to validate, may be null\n     * @throws IllegalArgumentException if the Option is not valid.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 51,col 9)",
        "(line 54,col 9)-(line 75,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionValidator.isValidOpt(char)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Returns whether the specified character is a valid Option.\n     *\n     * @param c the option to validate\n     * @return true if \u003ccode\u003ec\u003c/code\u003e is a letter, \u0027?\u0027 or \u0027@\u0027, otherwise false.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionValidator.isValidChar(char)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * Returns whether the specified character is a valid character.\n     *\n     * @param c the character to validate\n     * @return true if \u003ccode\u003ec\u003c/code\u003e is a letter.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 49)"
      ]
    }
  ]
}