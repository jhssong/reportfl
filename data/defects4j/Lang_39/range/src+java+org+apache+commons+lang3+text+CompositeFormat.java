{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/text/CompositeFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompositeFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 33,
      "end_line": 118,
      "comment": "\n * Formats using one formatter and parses using a different formatter. An\n * example of use for this would be a webapp where data is taken in one way and\n * stored in a database another way.\n * \n * @author Apache Software Foundation\n * @author Archimedes Trajano\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The parser to use. "
    },
    {
      "type": "field",
      "varNames": [
        "formatter"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The formatter to use. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.CompositeFormat.CompositeFormat(java.text.Format, java.text.Format)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Create a format that points its parseObject method to one implementation\n     * and its format method to another.\n     * \n     * @param parser implementation\n     * @param formatter implementation\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 29)",
        "(line 56,col 9)-(line 56,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.CompositeFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * Uses the formatter Format instance.\n     * \n     * @param obj the object to format\n     * @param toAppendTo the {@link StringBuffer} to append to\n     * @param pos the FieldPosition to use (or ignore).\n     * @return \u003ccode\u003etoAppendTo\u003c/code\u003e\n     * @see Format#format(Object, StringBuffer, FieldPosition)\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.CompositeFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Uses the parser Format instance.\n     * \n     * @param source the String source\n     * @param pos the ParsePosition containing the position to parse from, will\n     *            be updated according to parsing success (index) or failure\n     *            (error index)\n     * @return the parsed Object\n     * @see Format#parseObject(String, ParsePosition)\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.CompositeFormat.getParser()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Provides access to the parser Format implementation.\n     * \n     * @return parser Format implementation\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.CompositeFormat.getFormatter()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Provides access to the parser Format implementation.\n     * \n     * @return formatter Format implementation\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.CompositeFormat.reformat(java.lang.String)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Utility method to parse and then reformat a String.\n     * \n     * @param input String to reformat\n     * @return A reformatted String\n     * @throws ParseException thrown by parseObject(String) call\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 42)"
      ]
    }
  ]
}