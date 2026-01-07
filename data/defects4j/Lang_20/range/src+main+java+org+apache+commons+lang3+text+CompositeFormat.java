{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/text/CompositeFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompositeFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 31,
      "end_line": 116,
      "comment": "\n * Formats using one formatter and parses using a different formatter. An\n * example of use for this would be a webapp where data is taken in one way and\n * stored in a database another way.\n * \n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The parser to use. "
    },
    {
      "type": "field",
      "varNames": [
        "formatter"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The formatter to use. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.CompositeFormat.CompositeFormat(java.text.Format, java.text.Format)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Create a format that points its parseObject method to one implementation\n     * and its format method to another.\n     * \n     * @param parser implementation\n     * @param formatter implementation\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 29)",
        "(line 54,col 9)-(line 54,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.CompositeFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * Uses the formatter Format instance.\n     * \n     * @param obj the object to format\n     * @param toAppendTo the {@link StringBuffer} to append to\n     * @param pos the FieldPosition to use (or ignore).\n     * @return \u003ccode\u003etoAppendTo\u003c/code\u003e\n     * @see Format#format(Object, StringBuffer, FieldPosition)\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.CompositeFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n     * Uses the parser Format instance.\n     * \n     * @param source the String source\n     * @param pos the ParsePosition containing the position to parse from, will\n     *            be updated according to parsing success (index) or failure\n     *            (error index)\n     * @return the parsed Object\n     * @see Format#parseObject(String, ParsePosition)\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.CompositeFormat.getParser()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Provides access to the parser Format implementation.\n     * \n     * @return parser Format implementation\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.CompositeFormat.getFormatter()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Provides access to the parser Format implementation.\n     * \n     * @return formatter Format implementation\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.CompositeFormat.reformat(java.lang.String)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Utility method to parse and then reformat a String.\n     * \n     * @param input String to reformat\n     * @return A reformatted String\n     * @throws ParseException thrown by parseObject(String) call\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 42)"
      ]
    }
  ]
}