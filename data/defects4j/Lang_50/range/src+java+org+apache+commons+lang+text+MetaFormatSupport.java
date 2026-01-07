{
  "filepath": "/tmp/Lang-50b/src/java/org/apache/commons/lang/text/MetaFormatSupport.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MetaFormatSupport",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 34,
      "end_line": 131,
      "comment": "\n * metaFormat support.\n * \n * @see {@link ExtendedMessageFormat}\n * @author Matt Benson\n * @since 2.4\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "END_FE"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "START_FE"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "QUOTE"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MetaFormatSupport.invert(java.util.Map)",
      "begin_line": 49,
      "end_line": 56,
      "comment": "\n     * Invert the specified Map.\n     * \n     * @param map\n     *            the Map to invert.\n     * @return a new Map instance.\n     * @throws NullPointerException\n     *             if \u003ccode\u003emap\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 45)",
        "(line 51,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MetaFormatSupport.seekFormatElementEnd(java.lang.String, java.text.ParsePosition)",
      "begin_line": 64,
      "end_line": 83,
      "comment": "\n     * Find the end of the subformat.\n     * \n     * @param source\n     * @param pos\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 22)",
        "(line 66,col 9)-(line 66,col 30)",
        "(line 67,col 9)-(line 82,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MetaFormatSupport.next(java.text.ParsePosition)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n     * Advance the parse index by 1.\n     * \n     * @param pos\n     *            the ParsePosition to advance.\n     * @return \u003ccode\u003epos\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 41)",
        "(line 94,col 9)-(line 94,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MetaFormatSupport.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * Parse an object from the specified String and ParsePosition. If an error\n     * occurs \u003ccode\u003epos.getErrorIndex()\u003c/code\u003e will contain a value \u003e\u003d zero,\n     * indicating the index at which the parse error occurred.\n     * \n     * @param source\n     *            String to parse\n     * @param pos\n     *            ParsePosition marking index into \u003ccode\u003esource\u003c/code\u003e\n     * @return Object parsed\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.MetaFormatSupport.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 129,
      "end_line": 130,
      "comment": "\n     * Format the specified object, appending to the given StringBuffer, and\n     * optionally respecting the specified FieldPosition.\n     * \n     * @param obj\n     *            the object to format\n     * @param toAppendTo\n     *            the StringBuffer to which the formatted object should be\n     *            appended\n     * @param pos\n     *            FieldPosition associated with \u003ccode\u003eobj\u003c/code\u003e\n     * @return \u003ccode\u003etoAppendTo\u003c/code\u003e\n     * @throws NullPointerException\n     *             if \u003ccode\u003etoAppendTo\u003c/code\u003e or \u003ccode\u003epos\u003c/code\u003e is\n     *             \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if unable to format \u003ccode\u003eobj\u003c/code\u003e\n     ",
      "child_ranges": []
    }
  ]
}