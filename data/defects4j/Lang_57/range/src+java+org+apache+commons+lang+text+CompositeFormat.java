{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/text/CompositeFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompositeFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 32,
      "end_line": 105,
      "comment": "\n * Formats using one formatter and parses using a different formatter.\n * An example of use for this would be a webapp where data is taken in one way\n * and stored in a database another way.\n *\n * @author Archimedes Trajano\n * @version $Id: $\n "
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
      "comment": "\n     * Create a format that points its parseObject method to one implementation \n     * and its format method to another. \n     *\n     * @param parser implementation\n     * @param formatter implementation\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 29)",
        "(line 55,col 9)-(line 55,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Uses the formatter Format instance. \n     *\n     * @see Format#format(Object, StringBuffer, FieldPosition)\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Uses the parser Format instance. \n     *\n     * @see Format#parseObject(String, ParsePosition)\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.getParser()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Provides access to the parser Format implementation. \n     *\n     * @return parser Format implementation\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.getFormatter()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Provides access to the parser Format implementation. \n     *\n     * @return formatter Format implementation\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.reformat(java.lang.String)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Utility method to parse and then reformat a String. \n     * \n     * @param input String to reformat\n     * @return A reformatted String\n     * @throws ParseException thrown by parseObject(String) call\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 42)"
      ]
    }
  ]
}