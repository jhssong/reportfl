{
  "filepath": "/tmp/Cli-7b/src/java/org/apache/commons/cli2/validation/NumberValidator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberValidator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.validation.Validator"
      ],
      "begin_line": 55,
      "end_line": 200,
      "comment": "\n * The \u003ccode\u003eNumberValidator\u003c/code\u003e validates the string argument\n * values are numbers.  If the value is a number, the string value in\n * the {@link java.util.List} of values is replaced with the\n * {@link java.lang.Number} instance.\n *\n * A maximum and minimum value can also be specified using\n * the {@link #setMaximum setMaximum}, and the\n * {@link #setMinimum setMinimum} methods.\n *\n * The following example shows how to limit the valid values\n * for the age attribute to integers less than 100.\n *\n * \u003cpre\u003e\n * ...\n * ArgumentBuilder builder \u003d new ArgumentBuilder();\n * NumberValidator validator \u003d NumberValidator.getIntegerInstance();\n * validator.setMaximum(new Integer(100));\n *\n * Argument age \u003d\n *     builder.withName(\"age\");\n *            .withValidator(validator);\n * \u003c/pre\u003e\n *\n * @author Rob Oxspring\n * @author John Keyes\n "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " the \u003ccode\u003eNumberFormat\u003c/code\u003e being used. "
    },
    {
      "type": "field",
      "varNames": [
        "minimum"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " the lower bound for argument values. "
    },
    {
      "type": "field",
      "varNames": [
        "maximum"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " the upper bound for argument values "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.validation.NumberValidator.NumberValidator(java.text.NumberFormat)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Creates a new NumberValidator based on the specified NumberFormat\n     * @param format the format of numbers to accept\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.NumberValidator.getCurrencyInstance()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Returns a \u003ccode\u003eNumberValidator\u003c/code\u003e for a currency format\n     * for the current default locale.\n     * @return a \u003ccode\u003eNumberValidator\u003c/code\u003e for a currency format\n     * for the current default locale.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.NumberValidator.getIntegerInstance()",
      "begin_line": 89,
      "end_line": 94,
      "comment": "\n     * Returns a \u003ccode\u003eNumberValidator\u003c/code\u003e for an integer number format\n     * for the current default locale.\n     * @return a \u003ccode\u003eNumberValidator\u003c/code\u003e for an integer number format\n     * for the current default locale.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 69)",
        "(line 91,col 9)-(line 91,col 41)",
        "(line 93,col 9)-(line 93,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.NumberValidator.getPercentInstance()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Returns a \u003ccode\u003eNumberValidator\u003c/code\u003e for a percentage format\n     * for the current default locale.\n     * @return a \u003ccode\u003eNumberValidator\u003c/code\u003e for a percentage format\n     * for the current default locale.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.NumberValidator.getNumberInstance()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Returns a \u003ccode\u003eNumberValidator\u003c/code\u003e for a general-purpose\n     * number format for the current default locale.\n     * @return a \u003ccode\u003eNumberValidator\u003c/code\u003e for a general-purpose\n     * number format for the current default locale.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.NumberValidator.validate(java.util.List)",
      "begin_line": 123,
      "end_line": 145,
      "comment": "\n     * Validate the list of values against the list of permitted values.\n     * If a value is valid, replace the string in the \u003ccode\u003evalues\u003c/code\u003e\n     * {@link java.util.List} with the {@link java.lang.Number} instance.\n     *\n     * @see org.apache.commons.cli2.validation.Validator#validate(java.util.List)\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.NumberValidator.getFormat()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Return the format being used to validate argument values against.\n     *\n     * @return the format being used to validate argument values against.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.NumberValidator.setFormat(java.text.NumberFormat)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Specify the format being used to validate argument values against.\n     *\n     * @param format the format being used to validate argument values against.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.NumberValidator.getMaximum()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Return the maximum value allowed for an argument value.\n     *\n     * @return the maximum value allowed for an argument value.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.NumberValidator.setMaximum(java.lang.Number)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Specify the maximum value allowed for an argument value.\n     *\n     * @param maximum the maximum value allowed for an argument value.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.NumberValidator.getMinimum()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Return the minimum value allowed for an argument value.\n     *\n     * @return the minimum value allowed for an argument value.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.NumberValidator.setMinimum(java.lang.Number)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * Specify the minimum value allowed for an argument value.\n     *\n     * @param minimum the minimum value allowed for an argument value.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 31)"
      ]
    }
  ]
}