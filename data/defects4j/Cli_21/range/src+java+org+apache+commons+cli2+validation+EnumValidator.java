{
  "filepath": "/tmp/Cli-21b/src/java/org/apache/commons/cli2/validation/EnumValidator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EnumValidator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.validation.Validator"
      ],
      "begin_line": 47,
      "end_line": 120,
      "comment": "\n * The \u003ccode\u003eEnumValidator\u003c/code\u003e validates the string argument\n * values are valid.\n *\n * The following example shows how to limit the valid values\n * for the color argument to \u0027red\u0027, \u0027green\u0027, or \u0027blue\u0027.\n *\n * \u003cpre\u003e\n * Set values \u003d new HashSet();\n * values.add(\"red\");\n * values.add(\"green\");\n * values.add(\"blue\");\n * ...\n * ArgumentBuilder builder \u003d new ArgumentBuilder();\n * Argument color \u003d\n *     builder.withName(\"color\");\n *            .withValidator(new EnumValidator(values));\n * \u003c/pre\u003e\n *\n * @author John Keyes\n "
    },
    {
      "type": "field",
      "varNames": [
        "validValues"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " List of permitted values "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.validation.EnumValidator.EnumValidator(java.util.Set)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Creates a new EnumValidator for the specified values.\n     *\n     * @param values The list of permitted values\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.EnumValidator.validate(java.util.List)",
      "begin_line": 65,
      "end_line": 78,
      "comment": "\n     * Validate the list of values against the list of permitted values.\n     *\n     * @see org.apache.commons.cli2.validation.Validator#validate(java.util.List)\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 77,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.EnumValidator.getValuesAsString()",
      "begin_line": 85,
      "end_line": 101,
      "comment": "\n     * Returns the permitted values in a comma separated String\n     *\n     * @return String formatted list of values\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 53)",
        "(line 88,col 9)-(line 88,col 25)",
        "(line 90,col 9)-(line 96,col 9)",
        "(line 98,col 9)-(line 98,col 25)",
        "(line 100,col 9)-(line 100,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.EnumValidator.getValidValues()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Returns the Set of valid argument values.\n     *\n     * @return Returns the Set of valid argument values.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.EnumValidator.setValidValues(java.util.Set)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Specifies the Set of valid argument values.\n     *\n     * @param validValues The Set of valid argument values.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 39)"
      ]
    }
  ]
}