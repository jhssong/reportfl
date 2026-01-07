{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/text/CompositeFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompositeFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 32,
      "end_line": 115,
      "comment": "\n * Formats using one formatter and parses using a different formatter. An\n * example of use for this would be a webapp where data is taken in one way and\n * stored in a database another way.\n * \n * @author Archimedes Trajano\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The parser to use. "
    },
    {
      "type": "field",
      "varNames": [
        "formatter"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The formatter to use. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.CompositeFormat.CompositeFormat(java.text.Format, java.text.Format)",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Create a format that points its parseObject method to one implementation\n     * and its format method to another.\n     * \n     * @param parser implementation\n     * @param formatter implementation\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 29)",
        "(line 55,col 9)-(line 55,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * Uses the formatter Format instance.\n     * \n     * @param obj the object to format\n     * @param toAppendTo the {@link StringBuffer} to append to\n     * @param pos the FieldPosition to use (or ignore).\n     * @return \u003ccode\u003etoAppendTo\u003c/code\u003e\n     * @see Format#format(Object, StringBuffer, FieldPosition)\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Uses the parser Format instance.\n     * \n     * @param source the String source\n     * @param pos the ParsePosition containing the position to parse from, will\n     *            be updated according to parsing success (index) or failure\n     *            (error index)\n     * @return the parsed Object\n     * @see Format#parseObject(String, ParsePosition)\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.getParser()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Provides access to the parser Format implementation.\n     * \n     * @return parser Format implementation\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.getFormatter()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Provides access to the parser Format implementation.\n     * \n     * @return formatter Format implementation\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.reformat(java.lang.String)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Utility method to parse and then reformat a String.\n     * \n     * @param input String to reformat\n     * @return A reformatted String\n     * @throws ParseException thrown by parseObject(String) call\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 42)"
      ]
    }
  ]
}