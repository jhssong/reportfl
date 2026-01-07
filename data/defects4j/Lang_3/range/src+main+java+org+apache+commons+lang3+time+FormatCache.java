{
  "filepath": "/tmp/Lang-3b/src/main/java/org/apache/commons/lang3/time/FormatCache.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FormatCache",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 267,
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
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern, time zone\n     * and locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern, non-null\n     * @param timeZone  the time zone, null means use the default TimeZone\n     * @param locale  the locale, null means use the default Locale\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 77)",
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
      "begin_line": 120,
      "end_line": 126,
      "comment": " This must remain private, see LANG-884 ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 80)",
        "(line 125,col 9)-(line 125,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FormatCache.getDateTimeInstance(int, int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 142,
      "end_line": 144,
      "comment": " package protected, for access from FastDateFormat; do not make public or protected",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FormatCache.getDateInstance(int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 159,
      "end_line": 161,
      "comment": " package protected, for access from FastDateFormat; do not make public or protected",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FormatCache.getTimeInstance(int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 177,
      "end_line": 179,
      "comment": " package protected, for access from FastDateFormat; do not make public or protected",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FormatCache.getPatternForStyle(java.lang.Integer, java.lang.Integer, java.util.Locale)",
      "begin_line": 191,
      "end_line": 220,
      "comment": " package protected, for access from test code; do not make public or protected",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 80)",
        "(line 194,col 9)-(line 194,col 57)",
        "(line 195,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultipartKey",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 226,
      "end_line": 265,
      "comment": "\n     * \u003cp\u003eHelper class to hold multi-part Map keys\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 228,
      "end_line": 228,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FormatCache.MultipartKey.MultipartKey(java.lang.Object...)",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eMultipartKey\u003c/code\u003e to hold the specified objects.\n         * @param keys the set of objects that make up the key.  Each key may be null.\n         ",
      "child_ranges": [
        "(line 235,col 13)-(line 235,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FormatCache.MultipartKey.equals(java.lang.Object)",
      "begin_line": 241,
      "end_line": 247,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 246,col 13)-(line 246,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FormatCache.MultipartKey.hashCode()",
      "begin_line": 252,
      "end_line": 264,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 254,col 13)-(line 262,col 13)",
        "(line 263,col 13)-(line 263,col 28)"
      ]
    }
  ]
}