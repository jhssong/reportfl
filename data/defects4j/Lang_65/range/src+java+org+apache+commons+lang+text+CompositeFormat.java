{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/text/CompositeFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompositeFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 31,
      "end_line": 100,
      "comment": "\n * Formats using one formatter and parses using a different formatter.\n * An example of use for this would be a webapp where data is taken in one way\n * and stored in a database another way.\n *\n * @author Archimedes Trajano\n * @version $Id: $\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serialization lock. "
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The parser to use. "
    },
    {
      "type": "field",
      "varNames": [
        "formatter"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The formatter to use. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.CompositeFormat.CompositeFormat(java.text.Format, java.text.Format)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * Create a format that points its parseObject method to one implementation \n     * and its format method to another. \n     *\n     * @param parser implementation\n     * @param formatter implementation\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 29)",
        "(line 50,col 9)-(line 50,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Uses the formatter Format instance. \n     *\n     * @see Format#format(Object, StringBuffer, FieldPosition)\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Uses the parser Format instance. \n     *\n     * @see Format#parseObject(String, ParsePosition)\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.getParser()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Provides access to the parser Format implementation. \n     *\n     * @return parser Format implementation\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.getFormatter()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Provides access to the parser Format implementation. \n     *\n     * @return formatter Format implementation\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.CompositeFormat.reformat(java.lang.String)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Utility method to parse and then reformat a String. \n     * \n     * @param input String to reformat\n     * @return A reformatted String\n     * @throws ParseException thrown by parseObject(String) call\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 42)"
      ]
    }
  ]
}