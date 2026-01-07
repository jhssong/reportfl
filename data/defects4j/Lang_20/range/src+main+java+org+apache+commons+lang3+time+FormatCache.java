{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/time/FormatCache.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FormatCache",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 202,
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
      "end_line": 152,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style,\n     * time zone and locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 74)",
        "(line 125,col 9)-(line 125,col 57)",
        "(line 126,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 151,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultipartKey",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 158,
      "end_line": 200,
      "comment": "\n     * \u003cp\u003eHelper class to hold multi-part Map keys\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FormatCache.MultipartKey.MultipartKey(java.lang.Object...)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eMultipartKey\u003c/code\u003e to hold the specified objects.\n         * @param keys the set of objects that make up the key.  Each key may be null.\n         ",
      "child_ranges": [
        "(line 167,col 13)-(line 167,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FormatCache.MultipartKey.equals(java.lang.Object)",
      "begin_line": 173,
      "end_line": 182,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 175,col 13)-(line 177,col 13)",
        "(line 178,col 13)-(line 180,col 13)",
        "(line 181,col 13)-(line 181,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FormatCache.MultipartKey.hashCode()",
      "begin_line": 187,
      "end_line": 199,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 189,col 13)-(line 197,col 13)",
        "(line 198,col 13)-(line 198,col 28)"
      ]
    }
  ]
}