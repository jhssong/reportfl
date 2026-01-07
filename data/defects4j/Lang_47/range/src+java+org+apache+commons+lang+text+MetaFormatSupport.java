{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/text/MetaFormatSupport.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MetaFormatSupport",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 35,
      "end_line": 122,
      "comment": "\n * Support class for implementing Formats that parse/format other Formats, with\n * specific support for interoperability with ExtendedMessageFormat.\n * \n * @see ExtendedMessageFormat\n * @author Matt Benson\n * @since 2.4\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "END_FE"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "START_FE"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "QUOTE"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MetaFormatSupport.invert(java.util.Map)",
      "begin_line": 48,
      "end_line": 55,
      "comment": "\n     * Invert the specified Map.\n     * \n     * @param map the Map to invert.\n     * @return a new Map instance.\n     * @throws NullPointerException if \u003ccode\u003emap\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 45)",
        "(line 50,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 54,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MetaFormatSupport.seekFormatElementEnd(java.lang.String, java.text.ParsePosition)",
      "begin_line": 63,
      "end_line": 82,
      "comment": "\n     * Find the end of the subformat.\n     * \n     * @param source String\n     * @param pos current parse position\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 22)",
        "(line 65,col 9)-(line 65,col 30)",
        "(line 66,col 9)-(line 81,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MetaFormatSupport.next(java.text.ParsePosition)",
      "begin_line": 90,
      "end_line": 93,
      "comment": "\n     * Advance the parse index by 1.\n     * \n     * @param pos the ParsePosition to advance.\n     * @return \u003ccode\u003epos\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 41)",
        "(line 92,col 9)-(line 92,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MetaFormatSupport.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * Parse an object from the specified String and ParsePosition. If an error\n     * occurs \u003ccode\u003epos.getErrorIndex()\u003c/code\u003e will contain a value \u003e\u003d zero,\n     * indicating the index at which the parse error occurred.\n     * \n     * @param source String to parse\n     * @param pos ParsePosition marking index into \u003ccode\u003esource\u003c/code\u003e\n     * @return Object parsed\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MetaFormatSupport.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 120,
      "end_line": 121,
      "comment": "\n     * Format the specified object, appending to the given StringBuffer, and\n     * optionally respecting the specified FieldPosition.\n     * \n     * @param obj the object to format\n     * @param toAppendTo the StringBuffer to which the formatted object should\n     *            be appended\n     * @param pos FieldPosition associated with \u003ccode\u003eobj\u003c/code\u003e\n     * @return \u003ccode\u003etoAppendTo\u003c/code\u003e\n     * @throws NullPointerException if \u003ccode\u003etoAppendTo\u003c/code\u003e or\n     *             \u003ccode\u003epos\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if unable to format \u003ccode\u003eobj\u003c/code\u003e\n     ",
      "child_ranges": []
    }
  ]
}