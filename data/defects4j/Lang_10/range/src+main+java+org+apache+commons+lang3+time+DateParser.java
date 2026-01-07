{
  "filepath": "/tmp/Lang-10b/src/main/java/org/apache/commons/lang3/time/DateParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateParser",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 99,
      "comment": "\n * \u003cp\u003eDateParser is the \"missing\" interface for the parsing methods of \n * {@link java.text.DateFormat}.\u003c/p\u003e\n * \n * @since 3.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateParser.parse(java.lang.String)",
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Equivalent to DateFormat.parse(String). \n     * \n     * See {@link java.text.DateFormat#parse(String)} for more information. \n     * @param source A \u003ccode\u003eString\u003c/code\u003e whose beginning should be parsed. \n     * @return A \u003ccode\u003eDate\u003c/code\u003e parsed from the string\n     * @throws ParseException if the beginning of the specified string cannot be parsed.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateParser.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Equivalent to DateFormat.parse(String, ParsePosition). \n     * \n     * See {@link java.text.DateFormat#parse(String, ParsePosition)} for more information. \n     * \n     * @param source A \u003ccode\u003eString\u003c/code\u003e, part of which should be parsed.\n     * @param pos A \u003ccode\u003eParsePosition\u003c/code\u003e object with index and error index information \n     * as described above. \n     * @return A \u003ccode\u003eDate\u003c/code\u003e parsed from the string. In case of error, returns null. \n     * @throws NullPointerException if text or pos is null.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateParser.getPattern()",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * \u003cp\u003eGet the pattern used by this parser.\u003c/p\u003e\n     * \n     * @return the pattern, {@link java.text.SimpleDateFormat} compatible\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateParser.getTimeZone()",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * \u003cp\u003e\n     * Get the time zone used by this parser.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The default {@link TimeZone} used to create a {@link Date} when the {@link TimeZone} is not specified by\n     * the format pattern.\n     * \u003c/p\u003e\n     * \n     * @return the time zone\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateParser.getLocale()",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * \u003cp\u003eGet the locale used by this parser.\u003c/p\u003e\n     * \n     * @return the locale\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateParser.parseObject(java.lang.String)",
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * Parses text from a string to produce a Date.\n     * \n     * @see java.text.DateFormat#parseObject(String) \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateParser.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * Parse a date/time string according to the given parse position.\n     *  \n     * @see java.text.DateFormat#parseObject(String, ParsePosition) \n     ",
      "child_ranges": []
    }
  ]
}