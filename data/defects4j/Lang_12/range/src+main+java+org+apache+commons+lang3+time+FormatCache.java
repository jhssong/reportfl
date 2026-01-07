{
  "filepath": "/tmp/Lang-12b/src/main/java/org/apache/commons/lang3/time/FormatCache.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FormatCache",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 212,
      "comment": " TODO: Before making public move from getDateTimeInstance(Integer,...) to int; or some other approach."
    },
    {
      "type": "field",
      "varNames": [
        "NONE"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * No date or no time.  Used in same parameters as DateFormat.SHORT or DateFormat.LONG\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cInstanceCache"
      ],
      "begin_line": 41,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cDateTimeInstanceCache"
      ],
      "begin_line": 44,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FormatCache.getInstance()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the default pattern in the\n     * default timezone and locale.\u003c/p\u003e\n     * \n     * @return a date/time formatter\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FormatCache.getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 69,
      "end_line": 91,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern, time zone\n     * and locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  the non-null time zone\n     * @param locale  the non-null locale\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 71)",
        "(line 80,col 9)-(line 80,col 43)",
        "(line 81,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FormatCache.createInstance(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * \u003cp\u003eCreate a format instance using the specified pattern, time zone\n     * and locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible pattern, this will not be null.\n     * @param timeZone  time zone, this will not be null.\n     * @param locale  locale, this will not be null.\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FormatCache.getDateTimeInstance(java.lang.Integer, java.lang.Integer, java.util.TimeZone, java.util.Locale)",
      "begin_line": 119,
      "end_line": 125,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style,\n     * time zone and locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 74)",
        "(line 124,col 9)-(line 124,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FormatCache.getPatternForStyle(java.lang.Integer, java.lang.Integer, java.util.Locale)",
      "begin_line": 136,
      "end_line": 165,
      "comment": "\n     * \u003cp\u003eGets a date/time format for the specified styles and locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT, null indicates no date in format\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT, null indicates no time in format\n     * @param locale  The non-null locale of the desired format\n     * @return a localized standard date/time format\n     * @throws IllegalArgumentException if the Locale has no date/time pattern defined\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 74)",
        "(line 139,col 9)-(line 139,col 57)",
        "(line 140,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultipartKey",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 171,
      "end_line": 210,
      "comment": "\n     * \u003cp\u003eHelper class to hold multi-part Map keys\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FormatCache.MultipartKey.MultipartKey(java.lang.Object...)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eMultipartKey\u003c/code\u003e to hold the specified objects.\n         * @param keys the set of objects that make up the key.  Each key may be null.\n         ",
      "child_ranges": [
        "(line 180,col 13)-(line 180,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FormatCache.MultipartKey.equals(java.lang.Object)",
      "begin_line": 186,
      "end_line": 192,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 191,col 13)-(line 191,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FormatCache.MultipartKey.hashCode()",
      "begin_line": 197,
      "end_line": 209,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 199,col 13)-(line 207,col 13)",
        "(line 208,col 13)-(line 208,col 28)"
      ]
    }
  ]
}