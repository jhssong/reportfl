{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/text/CompositeFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompositeFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 31,
      "end_line": 104,
      "comment": "\n * Formats using one formatter and parses using a different formatter.\n * An example of use for this would be a webapp where data is taken in one way\n * and stored in a database another way.\n *\n * @author Archimedes Trajano\n * @version $Id: $\n "
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
      "signature": "org.apache.commons.lang.text.CompositeFormat.CompositeFormat(java.text.Format, java.text.Format)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Create a format that points its parseObject method to one implementation \n     * and its format method to another. \n     *\n     * @param parser implementation\n     * @param formatter implementation\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 29)",
        "(line 54,col 9)-(line 54,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Uses the formatter Format instance. \n     *\n     * @see Format#format(Object, StringBuffer, FieldPosition)\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Uses the parser Format instance. \n     *\n     * @see Format#parseObject(String, ParsePosition)\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.getParser()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Provides access to the parser Format implementation. \n     *\n     * @return parser Format implementation\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.getFormatter()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Provides access to the parser Format implementation. \n     *\n     * @return formatter Format implementation\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.reformat(java.lang.String)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Utility method to parse and then reformat a String. \n     * \n     * @param input String to reformat\n     * @return A reformatted String\n     * @throws ParseException thrown by parseObject(String) call\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 42)"
      ]
    }
  ]
}