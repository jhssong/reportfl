{
  "filepath": "/tmp/Lang-5b/src/main/java/org/apache/commons/lang3/time/FastDateParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateParser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.DateParser",
        "java.io.Serializable"
      ],
      "begin_line": 65,
      "end_line": 762,
      "comment": "\n * \u003cp\u003eFastDateParser is a fast and thread-safe version of\n * {@link java.text.SimpleDateFormat}.\u003c/p\u003e\n *\n * \u003cp\u003eThis class can be used as a direct replacement for\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e in most parsing situations.\n * This class is especially useful in multi-threaded server environments.\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e is not thread-safe in any JDK version,\n * nor will it be as Sun have closed the\n * \u003ca href\u003d\"http://bugs.sun.com/bugdatabase/view_bug.do?bug_id\u003d4228335\"\u003ebug\u003c/a\u003e/RFE.\n * \u003c/p\u003e\n *\n * \u003cp\u003eOnly parsing is supported, but all patterns are compatible with\n * SimpleDateFormat.\u003c/p\u003e\n *\n * \u003cp\u003eTiming tests indicate this class is as about as fast as SimpleDateFormat\n * in single thread applications and about 25% faster in multi-thread applications.\u003c/p\u003e\n *\n * \u003cp\u003eNote that the code only handles Gregorian calendars. The following non-Gregorian\n * calendars use SimpleDateFormat internally, and so will be slower:\n * \u003cul\u003e\n * \u003cli\u003eja_JP_TH - Japanese Imperial\u003c/li\u003e\n * \u003cli\u003eth_TH (any variant) - Thai Buddhist\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Required for serialization support.\n     *\n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAPANESE_IMPERIAL"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " defining fields"
    },
    {
      "type": "field",
      "varNames": [
        "timeZone"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parsePattern"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " derived fields"
    },
    {
      "type": "field",
      "varNames": [
        "strategies"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "thisYear"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentFormatField"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " dynamic fields to communicate with Strategy"
    },
    {
      "type": "field",
      "varNames": [
        "nextStrategy"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.FastDateParser(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 97,
      "end_line": 102,
      "comment": "\n     * \u003cp\u003eConstructs a new FastDateParser.\u003c/p\u003e\n     *\n     * @param pattern non-null {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone non-null time zone to use\n     * @param locale non-null locale\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 31)",
        "(line 99,col 9)-(line 99,col 33)",
        "(line 100,col 9)-(line 100,col 29)",
        "(line 101,col 9)-(line 101,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.init()",
      "begin_line": 108,
      "end_line": 146,
      "comment": "\n     * Initialize derived fields from defining fields.\n     * This is called from constructor and from readObject (de-serialization)\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 75)",
        "(line 110,col 9)-(line 110,col 54)",
        "(line 112,col 9)-(line 112,col 49)",
        "(line 113,col 9)-(line 113,col 61)",
        "(line 115,col 9)-(line 115,col 63)",
        "(line 116,col 9)-(line 119,col 9)",
        "(line 121,col 9)-(line 121,col 51)",
        "(line 122,col 9)-(line 122,col 84)",
        "(line 123,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 33)",
        "(line 144,col 9)-(line 144,col 70)",
        "(line 145,col 9)-(line 145,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getPattern()",
      "begin_line": 153,
      "end_line": 156,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#getPattern()\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getTimeZone()",
      "begin_line": 161,
      "end_line": 164,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#getTimeZone()\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getLocale()",
      "begin_line": 169,
      "end_line": 172,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#getLocale()\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getParsePattern()",
      "begin_line": 175,
      "end_line": 177,
      "comment": " Give access to generated pattern for test code",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.equals(java.lang.Object)",
      "begin_line": 187,
      "end_line": 196,
      "comment": "\n     * \u003cp\u003eCompare another object for equality with this object.\u003c/p\u003e\n     *\n     * @param obj  the object to compare to\n     * @return \u003ccode\u003etrue\u003c/code\u003eif equal to this instance\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 52)",
        "(line 193,col 9)-(line 195,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.hashCode()",
      "begin_line": 203,
      "end_line": 206,
      "comment": "\n     * \u003cp\u003eReturn a hashcode compatible with equals.\u003c/p\u003e\n     *\n     * @return a hashcode compatible with equals\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.toString()",
      "begin_line": 213,
      "end_line": 216,
      "comment": "\n     * \u003cp\u003eGet a string version of this formatter.\u003c/p\u003e\n     *\n     * @return a debugging string\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.readObject(java.io.ObjectInputStream)",
      "begin_line": 228,
      "end_line": 231,
      "comment": "\n     * Create the object after serialization. This implementation reinitializes the\n     * transient properties.\n     *\n     * @param in ObjectInputStream from which the object is being deserialized.\n     * @throws IOException if there is an IO issue.\n     * @throws ClassNotFoundException if a class cannot be found.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 31)",
        "(line 230,col 9)-(line 230,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.parseObject(java.lang.String)",
      "begin_line": 236,
      "end_line": 239,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#parseObject(java.lang.String)\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.parse(java.lang.String)",
      "begin_line": 244,
      "end_line": 257,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#parse(java.lang.String)\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 55)",
        "(line 247,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 262,
      "end_line": 265,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#parseObject(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 270,
      "end_line": 287,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DateParser#parse(java.lang.String, java.text.ParsePosition)\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 35)",
        "(line 273,col 9)-(line 273,col 72)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 278,col 61)",
        "(line 279,col 9)-(line 279,col 20)",
        "(line 281,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 43)",
        "(line 286,col 9)-(line 286,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.escapeRegex(java.lang.StringBuilder, java.lang.String, boolean)",
      "begin_line": 299,
      "end_line": 335,
      "comment": "\n     * Escape constant fields into regular expression\n     * @param regex The destination regex\n     * @param value The source field\n     * @param unquote If true, replace two success quotes (\u0027\u0027) with single quote (\u0027)\n     * @return The \u003ccode\u003eStringBuilder\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 28)",
        "(line 301,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 28)",
        "(line 334,col 9)-(line 334,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getDisplayNames(int, java.util.Calendar, java.util.Locale)",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\n     * Get the short and long values displayed for a field\n     * @param field The field of interest\n     * @param definingCalendar The calendar to obtain the short and long values\n     * @param locale The locale of display names\n     * @return A Map of the field key / value pairs\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.adjustYear(int)",
      "begin_line": 354,
      "end_line": 360,
      "comment": "\n     * Adjust dates to be within 80 years before and 20 years after instantiation\n     * @param twoDigitYear The year to adjust\n     * @return A value within -80 and +20 years from instantiation of this instance\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 58)",
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.isNextNumber()",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\n     * Is the next field a number?\n     * @return true, if next field will be a number\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getFieldWidth()",
      "begin_line": 374,
      "end_line": 376,
      "comment": "\n     * What is the width of the current field?\n     * @return The number of characters in the current format field\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Strategy",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 381,
      "end_line": 413,
      "comment": "\n     * A strategy to parse a single field from the parsing pattern\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Strategy.isNumber()",
      "begin_line": 388,
      "end_line": 390,
      "comment": "\n         * Is this field a number?\n         * The default implementation returns true.\n         * \n         * @return true, if field is a number\n         ",
      "child_ranges": [
        "(line 389,col 13)-(line 389,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Strategy.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 400,
      "end_line": 402,
      "comment": "\n         * Set the Calendar with the parsed field.\n         * \n         * The default implementation does nothing.\n         * \n         * @param parser The parser calling this strategy\n         * @param cal The \u003ccode\u003eCalendar\u003c/code\u003e to set\n         * @param value The parsed field to translate and set in cal\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Strategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 412,
      "end_line": 412,
      "comment": "\n         * Generate a \u003ccode\u003ePattern\u003c/code\u003e regular expression to the \u003ccode\u003eStringBuilder\u003c/code\u003e\n         * which will accept this field\n         * @param parser The parser calling this strategy\n         * @param regex The \u003ccode\u003eStringBuilder\u003c/code\u003e to append to\n         * @param Calendar The calendar this strategy must parse\n         * @return true, if this field will set the calendar;\n         * false, if this field is a constant value\n         ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "formatPattern"
      ],
      "begin_line": 418,
      "end_line": 419,
      "comment": "\n     * A \u003ccode\u003ePattern\u003c/code\u003e to parse the user supplied SimpleDateFormat pattern\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getStrategy(java.lang.String, java.util.Calendar)",
      "begin_line": 427,
      "end_line": 474,
      "comment": "\n     * Obtain a Strategy given a field from a SimpleDateFormat pattern\n     * @param formatField A sub-sequence of the SimpleDateFormat pattern\n     * @param definingCalendar The calendar to obtain the short and long values\n     * @return The Strategy that will handle parsing for the field\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 473,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "caches"
      ],
      "begin_line": 476,
      "end_line": 477,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getCache(int)",
      "begin_line": 484,
      "end_line": 491,
      "comment": "\n     * Get a cache of Strategies for a particular field\n     * @param field The Calendar field\n     * @return a cache of Locale to Strategy\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 490,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.getLocaleSpecificStrategy(int, java.util.Calendar)",
      "begin_line": 500,
      "end_line": 513,
      "comment": "\n     * Construct a Strategy that parses a Text field\n     * @param locale The Locale of the TimeZone to parse\n     * @param field The Calendar field\n     * @param definingCalendar The calendar to obtain the short and long values\n     * @return a TextStrategy for the field and Locale\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 63)",
        "(line 502,col 9)-(line 502,col 61)",
        "(line 503,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 512,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CopyQuotedStrategy",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateParser.Strategy"
      ],
      "begin_line": 518,
      "end_line": 549,
      "comment": "\n     * A strategy that copies the static or quoted field in the parsing pattern\n     "
    },
    {
      "type": "field",
      "varNames": [
        "formatField"
      ],
      "begin_line": 519,
      "end_line": 519,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.CopyQuotedStrategy.CopyQuotedStrategy(java.lang.String)",
      "begin_line": 525,
      "end_line": 527,
      "comment": "\n         * Construct a Strategy that ensures the formatField has literal text\n         * @param formatField The literal text to match\n         ",
      "child_ranges": [
        "(line 526,col 13)-(line 526,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.CopyQuotedStrategy.isNumber()",
      "begin_line": 532,
      "end_line": 539,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 534,col 13)-(line 534,col 42)",
        "(line 535,col 13)-(line 537,col 13)",
        "(line 538,col 13)-(line 538,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.CopyQuotedStrategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 544,
      "end_line": 548,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 546,col 13)-(line 546,col 50)",
        "(line 547,col 13)-(line 547,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TextStrategy",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateParser.Strategy"
      ],
      "begin_line": 554,
      "end_line": 597,
      "comment": "\n     * A strategy that handles a text field in the parsing pattern\n     "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 555,
      "end_line": 555,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "keyValues"
      ],
      "begin_line": 556,
      "end_line": 556,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TextStrategy.TextStrategy(int, java.util.Calendar, java.util.Locale)",
      "begin_line": 562,
      "end_line": 565,
      "comment": "\n         * Construct a Strategy that parses a Text field\n         * @param field The Calendar field\n         ",
      "child_ranges": [
        "(line 563,col 13)-(line 563,col 30)",
        "(line 564,col 13)-(line 564,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TextStrategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 570,
      "end_line": 578,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 572,col 13)-(line 572,col 30)",
        "(line 573,col 13)-(line 575,col 13)",
        "(line 576,col 13)-(line 576,col 51)",
        "(line 577,col 13)-(line 577,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TextStrategy.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 583,
      "end_line": 596,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 585,col 13)-(line 585,col 48)",
        "(line 586,col 13)-(line 594,col 13)",
        "(line 595,col 13)-(line 595,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NumberStrategy",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateParser.Strategy"
      ],
      "begin_line": 603,
      "end_line": 652,
      "comment": "\n     * A strategy that handles a number field in the parsing pattern\n     "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 604,
      "end_line": 604,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.NumberStrategy(int)",
      "begin_line": 610,
      "end_line": 612,
      "comment": "\n         * Construct a Strategy that parses a Number field\n         * @param field The Calendar field\n         ",
      "child_ranges": [
        "(line 611,col 14)-(line 611,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.isNumber()",
      "begin_line": 617,
      "end_line": 620,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 619,col 13)-(line 619,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 625,
      "end_line": 634,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 627,col 13)-(line 632,col 13)",
        "(line 633,col 13)-(line 633,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 639,
      "end_line": 642,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 641,col 13)-(line 641,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.NumberStrategy.modify(int)",
      "begin_line": 649,
      "end_line": 651,
      "comment": "\n         * Make any modifications to parsed integer\n         * @param iValue The parsed integer\n         * @return The modified value\n         ",
      "child_ranges": [
        "(line 650,col 13)-(line 650,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ABBREVIATED_YEAR_STRATEGY"
      ],
      "begin_line": 654,
      "end_line": 666,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Anonymous-77f10a05-4b58-4e25-90cf-6bcf45f0cd9d.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 658,
      "end_line": 665,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 660,col 13)-(line 660,col 48)",
        "(line 661,col 13)-(line 663,col 13)",
        "(line 664,col 13)-(line 664,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneStrategy",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateParser.Strategy"
      ],
      "begin_line": 671,
      "end_line": 731,
      "comment": "\n     * A strategy that handles a timezone field in the parsing pattern\n     "
    },
    {
      "type": "field",
      "varNames": [
        "validTimeZoneChars"
      ],
      "begin_line": 673,
      "end_line": 673,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tzNames"
      ],
      "begin_line": 674,
      "end_line": 674,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy.TimeZoneStrategy(java.util.Locale)",
      "begin_line": 680,
      "end_line": 700,
      "comment": "\n         * Construct a Strategy that parses a TimeZone\n         * @param locale The Locale\n         ",
      "child_ranges": [
        "(line 681,col 13)-(line 692,col 13)",
        "(line 693,col 13)-(line 693,col 50)",
        "(line 694,col 13)-(line 694,col 72)",
        "(line 695,col 13)-(line 697,col 13)",
        "(line 698,col 13)-(line 698,col 45)",
        "(line 699,col 13)-(line 699,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy.addRegex(org.apache.commons.lang3.time.FastDateParser, java.lang.StringBuilder)",
      "begin_line": 705,
      "end_line": 709,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 707,col 13)-(line 707,col 45)",
        "(line 708,col 13)-(line 708,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy.setCalendar(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String)",
      "begin_line": 714,
      "end_line": 730,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 716,col 13)-(line 716,col 24)",
        "(line 717,col 13)-(line 728,col 13)",
        "(line 729,col 13)-(line 729,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_MONTH_STRATEGY"
      ],
      "begin_line": 733,
      "end_line": 738,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Anonymous-5d64c984-adeb-483c-9e32-2b286185288e.modify(int)",
      "begin_line": 734,
      "end_line": 737,
      "comment": "",
      "child_ranges": [
        "(line 736,col 13)-(line 736,col 28)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LITERAL_YEAR_STRATEGY"
      ],
      "begin_line": 739,
      "end_line": 739,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WEEK_OF_YEAR_STRATEGY"
      ],
      "begin_line": 740,
      "end_line": 740,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WEEK_OF_MONTH_STRATEGY"
      ],
      "begin_line": 741,
      "end_line": 741,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DAY_OF_YEAR_STRATEGY"
      ],
      "begin_line": 742,
      "end_line": 742,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DAY_OF_MONTH_STRATEGY"
      ],
      "begin_line": 743,
      "end_line": 743,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DAY_OF_WEEK_IN_MONTH_STRATEGY"
      ],
      "begin_line": 744,
      "end_line": 744,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HOUR_OF_DAY_STRATEGY"
      ],
      "begin_line": 745,
      "end_line": 745,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MODULO_HOUR_OF_DAY_STRATEGY"
      ],
      "begin_line": 746,
      "end_line": 751,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Anonymous-133d32b2-f75e-4db2-aef2-ad671c5cb32c.modify(int)",
      "begin_line": 747,
      "end_line": 750,
      "comment": "",
      "child_ranges": [
        "(line 749,col 13)-(line 749,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MODULO_HOUR_STRATEGY"
      ],
      "begin_line": 752,
      "end_line": 757,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateParser.Anonymous-1c4b152b-29bc-4613-8c20-e95c16e80045.modify(int)",
      "begin_line": 753,
      "end_line": 756,
      "comment": "",
      "child_ranges": [
        "(line 755,col 13)-(line 755,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "HOUR_STRATEGY"
      ],
      "begin_line": 758,
      "end_line": 758,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MINUTE_STRATEGY"
      ],
      "begin_line": 759,
      "end_line": 759,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SECOND_STRATEGY"
      ],
      "begin_line": 760,
      "end_line": 760,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MILLISECOND_STRATEGY"
      ],
      "begin_line": 761,
      "end_line": 761,
      "comment": ""
    }
  ]
}