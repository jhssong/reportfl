{
  "filepath": "/tmp/Lang-7b/src/main/java/org/apache/commons/lang3/time/DatePrinter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DatePrinter",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 125,
      "comment": "\n * \u003cp\u003eDatePrinter is the \"missing\" interface for the format methods of \n * {@link java.text.DateFormat}.\u003c/p\u003e\n * \n * @since 3.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DatePrinter.format(long)",
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * \u003cp\u003eFormats a millisecond {@code long} value.\u003c/p\u003e\n     *\n     * @param millis  the millisecond value to format\n     * @return the formatted string\n     * @since 2.1\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DatePrinter.format(java.util.Date)",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * \u003cp\u003eFormats a {@code Date} object using a {@code GregorianCalendar}.\u003c/p\u003e\n     *\n     * @param date  the date to format\n     * @return the formatted string\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DatePrinter.format(java.util.Calendar)",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * \u003cp\u003eFormats a {@code Calendar} object.\u003c/p\u003e\n     *\n     * @param calendar  the calendar to format\n     * @return the formatted string\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DatePrinter.format(long, java.lang.StringBuffer)",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * \u003cp\u003eFormats a milliseond {@code long} value into the\n     * supplied {@code StringBuffer}.\u003c/p\u003e\n     *\n     * @param millis  the millisecond value to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DatePrinter.format(java.util.Date, java.lang.StringBuffer)",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * \u003cp\u003eFormats a {@code Date} object into the\n     * supplied {@code StringBuffer} using a {@code GregorianCalendar}.\u003c/p\u003e\n     *\n     * @param date  the date to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DatePrinter.format(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * \u003cp\u003eFormats a {@code Calendar} object into the\n     * supplied {@code StringBuffer}.\u003c/p\u003e\n     *\n     * @param calendar  the calendar to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DatePrinter.getPattern()",
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * \u003cp\u003eGets the pattern used by this printer.\u003c/p\u003e\n     *\n     * @return the pattern, {@link java.text.SimpleDateFormat} compatible\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DatePrinter.getTimeZone()",
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * \u003cp\u003eGets the time zone used by this printer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis zone is always used for {@code Date} printing. \u003c/p\u003e\n     *\n     * @return the time zone\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DatePrinter.getLocale()",
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * \u003cp\u003eGets the locale used by this printer.\u003c/p\u003e\n     *\n     * @return the locale\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DatePrinter.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * \u003cp\u003eFormats a {@code Date}, {@code Calendar} or\n     * {@code Long} (milliseconds) object.\u003c/p\u003e\n     * \n     * See {@link java.text.DateFormat#format(Object, StringBuffer, FieldPosition)}\n     * \n     * @param obj  the object to format\n     * @param toAppendTo  the buffer to append to\n     * @param pos  the position - ignored\n     * @return the buffer passed in\n     ",
      "child_ranges": []
    }
  ]
}