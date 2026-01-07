{
  "filepath": "/tmp/Lang-12b/src/main/java/org/apache/commons/lang3/time/FastDatePrinter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDatePrinter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.DatePrinter",
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 1243,
      "comment": "\n * \u003cp\u003eFastDatePrinter is a fast and thread-safe version of\n * {@link java.text.SimpleDateFormat}.\u003c/p\u003e\n *\n * \u003cp\u003eThis class can be used as a direct replacement to\n * {@code SimpleDateFormat} in most formatting situations.\n * This class is especially useful in multi-threaded server environments.\n * {@code SimpleDateFormat} is not thread-safe in any JDK version,\n * nor will it be as Sun have closed the bug/RFE.\n * \u003c/p\u003e\n *\n * \u003cp\u003eOnly formatting is supported, but all patterns are compatible with\n * SimpleDateFormat (except time zones and some year patterns - see below).\u003c/p\u003e\n *\n * \u003cp\u003eJava 1.4 introduced a new pattern letter, {@code \u0027Z\u0027}, to represent\n * time zones in RFC822 format (eg. {@code +0800} or {@code -1100}).\n * This pattern letter can be used here (on all JDK versions).\u003c/p\u003e\n *\n * \u003cp\u003eIn addition, the pattern {@code \u0027ZZ\u0027} has been made to represent\n * ISO8601 full format time zones (eg. {@code +08:00} or {@code -11:00}).\n * This introduces a minor incompatibility with Java 1.4, but at a gain of\n * useful functionality.\u003c/p\u003e\n *\n * \u003cp\u003eJavadoc cites for the year pattern: \u003ci\u003eFor formatting, if the number of\n * pattern letters is 2, the year is truncated to 2 digits; otherwise it is\n * interpreted as a number.\u003c/i\u003e Starting with Java 1.7 a pattern of \u0027Y\u0027 or\n * \u0027YYY\u0027 will be formatted as \u00272003\u0027, while it was \u002703\u0027 in former Java\n * versions. FastDatePrinter implements the behavior of Java 7.\u003c/p\u003e\n *\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Required for serialization support.\n     *\n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * FULL locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONG"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * LONG locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MEDIUM"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * MEDIUM locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * SHORT locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mPattern"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * The pattern.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * The time zone.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * The locale.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRules"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n     * The parsed rules.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mMaxLengthEstimate"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * The estimated maximum length.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.FastDatePrinter(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 136,
      "end_line": 142,
      "comment": "\n     * \u003cp\u003eConstructs a new FastDatePrinter.\u003c/p\u003e\n     *\n     * @param pattern  {@link java.text.SimpleDateFormat} compatible pattern\n     * @param timeZone  non-null time zone to use\n     * @param locale  non-null locale to use\n     * @throws NullPointerException if pattern, timeZone, or locale is null.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 27)",
        "(line 138,col 9)-(line 138,col 29)",
        "(line 139,col 9)-(line 139,col 25)",
        "(line 141,col 9)-(line 141,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.init()",
      "begin_line": 147,
      "end_line": 157,
      "comment": "\n     * \u003cp\u003eInitializes the instance for first use.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 46)",
        "(line 149,col 9)-(line 149,col 63)",
        "(line 151,col 9)-(line 151,col 20)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 156,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.parsePattern()",
      "begin_line": 167,
      "end_line": 288,
      "comment": "\n     * \u003cp\u003eReturns a list of Rules given a pattern.\u003c/p\u003e\n     *\n     * @return a {@code List} of Rule objects\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 67)",
        "(line 169,col 9)-(line 169,col 49)",
        "(line 171,col 9)-(line 171,col 42)",
        "(line 172,col 9)-(line 172,col 46)",
        "(line 173,col 9)-(line 173,col 56)",
        "(line 174,col 9)-(line 174,col 50)",
        "(line 175,col 9)-(line 175,col 60)",
        "(line 176,col 9)-(line 176,col 56)",
        "(line 178,col 9)-(line 178,col 39)",
        "(line 179,col 9)-(line 179,col 36)",
        "(line 181,col 9)-(line 285,col 9)",
        "(line 287,col 9)-(line 287,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.parseToken(java.lang.String, int[])",
      "begin_line": 297,
      "end_line": 347,
      "comment": "\n     * \u003cp\u003ePerforms the parsing of tokens.\u003c/p\u003e\n     *\n     * @param pattern  the pattern\n     * @param indexRef  index references\n     * @return parsed token\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 48)",
        "(line 300,col 9)-(line 300,col 28)",
        "(line 301,col 9)-(line 301,col 38)",
        "(line 303,col 9)-(line 303,col 35)",
        "(line 304,col 9)-(line 343,col 9)",
        "(line 345,col 9)-(line 345,col 24)",
        "(line 346,col 9)-(line 346,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.selectNumberRule(int, int)",
      "begin_line": 356,
      "end_line": 365,
      "comment": "\n     * \u003cp\u003eGets an appropriate rule for the padding required.\u003c/p\u003e\n     *\n     * @param field  the field to get a rule for\n     * @param padding  the padding required\n     * @return a new rule with the correct padding\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 364,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 378,
      "end_line": 390,
      "comment": "\n     * \u003cp\u003eFormats a {@code Date}, {@code Calendar} or\n     * {@code Long} (milliseconds) object.\u003c/p\u003e\n     *\n     * @param obj  the object to format\n     * @param toAppendTo  the buffer to append to\n     * @param pos  the position - ignored\n     * @return the buffer passed in\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 389,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(long)",
      "begin_line": 395,
      "end_line": 398,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#format(long)\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(java.util.Date)",
      "begin_line": 403,
      "end_line": 408,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Date)\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 63)",
        "(line 406,col 9)-(line 406,col 24)",
        "(line 407,col 9)-(line 407,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(java.util.Calendar)",
      "begin_line": 413,
      "end_line": 416,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Calendar)\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(long, java.lang.StringBuffer)",
      "begin_line": 421,
      "end_line": 424,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#format(long, java.lang.StringBuffer)\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(java.util.Date, java.lang.StringBuffer)",
      "begin_line": 429,
      "end_line": 434,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Date, java.lang.StringBuffer)\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 63)",
        "(line 432,col 9)-(line 432,col 24)",
        "(line 433,col 9)-(line 433,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 439,
      "end_line": 442,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Calendar, java.lang.StringBuffer)\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.applyRules(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 452,
      "end_line": 457,
      "comment": "\n     * \u003cp\u003ePerforms the formatting by applying the rules to the\n     * specified calendar.\u003c/p\u003e\n     *\n     * @param calendar  the calendar to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 456,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.getPattern()",
      "begin_line": 464,
      "end_line": 467,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#getPattern()\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.getTimeZone()",
      "begin_line": 472,
      "end_line": 475,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#getTimeZone()\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.getLocale()",
      "begin_line": 480,
      "end_line": 483,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#getLocale()\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.getMaxLengthEstimate()",
      "begin_line": 494,
      "end_line": 496,
      "comment": "\n     * \u003cp\u003eGets an estimate for the maximum string length that the\n     * formatter will produce.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual formatted length will almost always be less than or\n     * equal to this amount.\u003c/p\u003e\n     *\n     * @return the maximum formatted length\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.equals(java.lang.Object)",
      "begin_line": 506,
      "end_line": 515,
      "comment": "\n     * \u003cp\u003eCompares two objects for equality.\u003c/p\u003e\n     *\n     * @param obj  the object to compare to\n     * @return {@code true} if equal\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 511,col 54)",
        "(line 512,col 9)-(line 514,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.hashCode()",
      "begin_line": 522,
      "end_line": 525,
      "comment": "\n     * \u003cp\u003eReturns a hashcode compatible with equals.\u003c/p\u003e\n     *\n     * @return a hashcode compatible with equals\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.toString()",
      "begin_line": 532,
      "end_line": 535,
      "comment": "\n     * \u003cp\u003eGets a debugging string version of this formatter.\u003c/p\u003e\n     *\n     * @return a debugging string\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.readObject(java.io.ObjectInputStream)",
      "begin_line": 547,
      "end_line": 550,
      "comment": "\n     * Create the object after serialization. This implementation reinitializes the\n     * transient properties.\n     *\n     * @param in ObjectInputStream from which the object is being deserialized.\n     * @throws IOException if there is an IO issue.\n     * @throws ClassNotFoundException if a class cannot be found.\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 31)",
        "(line 549,col 9)-(line 549,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Rule",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 557,
      "end_line": 572,
      "comment": "\n     * \u003cp\u003eInner class defining a rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.Rule.estimateLength()",
      "begin_line": 563,
      "end_line": 563,
      "comment": "\n         * Returns the estimated lentgh of the result.\n         *\n         * @return the estimated length\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.Rule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 571,
      "end_line": 571,
      "comment": "\n         * Appends the value of the specified calendar to the output buffer based on the rule implementation.\n         *\n         * @param buffer the output buffer\n         * @param calendar calendar to be appended\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NumberRule",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.Rule"
      ],
      "begin_line": 577,
      "end_line": 585,
      "comment": "\n     * \u003cp\u003eInner class defining a numeric rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.NumberRule.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 584,
      "end_line": 584,
      "comment": "\n         * Appends the specified value to the output buffer based on the rule implementation.\n         *\n         * @param buffer the output buffer\n         * @param value the value to be appended\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "CharacterLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.Rule"
      ],
      "begin_line": 590,
      "end_line": 618,
      "comment": "\n     * \u003cp\u003eInner class to output a constant single character.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 591,
      "end_line": 591,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.CharacterLiteral.CharacterLiteral(char)",
      "begin_line": 599,
      "end_line": 601,
      "comment": "\n         * Constructs a new instance of {@code CharacterLiteral}\n         * to hold the specified value.\n         *\n         * @param value the character literal\n         ",
      "child_ranges": [
        "(line 600,col 13)-(line 600,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.CharacterLiteral.estimateLength()",
      "begin_line": 606,
      "end_line": 609,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 608,col 13)-(line 608,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.CharacterLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 614,
      "end_line": 617,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 616,col 13)-(line 616,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.Rule"
      ],
      "begin_line": 623,
      "end_line": 651,
      "comment": "\n     * \u003cp\u003eInner class to output a constant string.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 624,
      "end_line": 624,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.StringLiteral.StringLiteral(java.lang.String)",
      "begin_line": 632,
      "end_line": 634,
      "comment": "\n         * Constructs a new instance of {@code StringLiteral}\n         * to hold the specified value.\n         *\n         * @param value the string literal\n         ",
      "child_ranges": [
        "(line 633,col 13)-(line 633,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.StringLiteral.estimateLength()",
      "begin_line": 639,
      "end_line": 642,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 641,col 13)-(line 641,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.StringLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 647,
      "end_line": 650,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 649,col 13)-(line 649,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TextField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.Rule"
      ],
      "begin_line": 656,
      "end_line": 694,
      "comment": "\n     * \u003cp\u003eInner class to output one of a set of values.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 657,
      "end_line": 657,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mValues"
      ],
      "begin_line": 658,
      "end_line": 658,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TextField.TextField(int, java.lang.String[])",
      "begin_line": 667,
      "end_line": 670,
      "comment": "\n         * Constructs an instance of {@code TextField}\n         * with the specified field and values.\n         *\n         * @param field the field\n         * @param values the field values\n         ",
      "child_ranges": [
        "(line 668,col 13)-(line 668,col 27)",
        "(line 669,col 13)-(line 669,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TextField.estimateLength()",
      "begin_line": 675,
      "end_line": 685,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 677,col 13)-(line 677,col 24)",
        "(line 678,col 13)-(line 683,col 13)",
        "(line 684,col 13)-(line 684,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TextField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 690,
      "end_line": 693,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 692,col 13)-(line 692,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnpaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 699,
      "end_line": 741,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 700,
      "end_line": 700,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedNumberField.UnpaddedNumberField(int)",
      "begin_line": 707,
      "end_line": 709,
      "comment": "\n         * Constructs an instance of {@code UnpadedNumberField} with the specified field.\n         *\n         * @param field the field\n         ",
      "child_ranges": [
        "(line 708,col 13)-(line 708,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedNumberField.estimateLength()",
      "begin_line": 714,
      "end_line": 717,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 716,col 13)-(line 716,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 722,
      "end_line": 725,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 724,col 13)-(line 724,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 730,
      "end_line": 740,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 732,col 13)-(line 739,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnpaddedMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 746,
      "end_line": 785,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 747,
      "end_line": 747,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField.UnpaddedMonthField()",
      "begin_line": 753,
      "end_line": 755,
      "comment": "\n         * Constructs an instance of {@code UnpaddedMonthField}.\n         *\n         ",
      "child_ranges": [
        "(line 754,col 13)-(line 754,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField.estimateLength()",
      "begin_line": 760,
      "end_line": 763,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 762,col 13)-(line 762,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 768,
      "end_line": 771,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 770,col 13)-(line 770,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 776,
      "end_line": 784,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 778,col 13)-(line 783,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 790,
      "end_line": 850,
      "comment": "\n     * \u003cp\u003eInner class to output a padded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 791,
      "end_line": 791,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mSize"
      ],
      "begin_line": 792,
      "end_line": 792,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.PaddedNumberField.PaddedNumberField(int, int)",
      "begin_line": 800,
      "end_line": 807,
      "comment": "\n         * Constructs an instance of {@code PaddedNumberField}.\n         *\n         * @param field the field\n         * @param size size of the output field\n         ",
      "child_ranges": [
        "(line 801,col 13)-(line 804,col 13)",
        "(line 805,col 13)-(line 805,col 27)",
        "(line 806,col 13)-(line 806,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.PaddedNumberField.estimateLength()",
      "begin_line": 812,
      "end_line": 815,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 814,col 13)-(line 814,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.PaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 820,
      "end_line": 823,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 822,col 13)-(line 822,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.PaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 828,
      "end_line": 849,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 830,col 13)-(line 848,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 855,
      "end_line": 895,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 856,
      "end_line": 856,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitNumberField.TwoDigitNumberField(int)",
      "begin_line": 863,
      "end_line": 865,
      "comment": "\n         * Constructs an instance of {@code TwoDigitNumberField} with the specified field.\n         *\n         * @param field the field\n         ",
      "child_ranges": [
        "(line 864,col 13)-(line 864,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitNumberField.estimateLength()",
      "begin_line": 870,
      "end_line": 873,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 872,col 13)-(line 872,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 878,
      "end_line": 881,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 880,col 13)-(line 880,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 886,
      "end_line": 894,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 888,col 13)-(line 893,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitYearField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 900,
      "end_line": 934,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit year.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 901,
      "end_line": 901,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField.TwoDigitYearField()",
      "begin_line": 906,
      "end_line": 908,
      "comment": "\n         * Constructs an instance of {@code TwoDigitYearField}.\n         ",
      "child_ranges": [
        "(line 907,col 13)-(line 907,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField.estimateLength()",
      "begin_line": 913,
      "end_line": 916,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 915,col 13)-(line 915,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 921,
      "end_line": 924,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 923,col 13)-(line 923,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 929,
      "end_line": 933,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 931,col 13)-(line 931,col 52)",
        "(line 932,col 13)-(line 932,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 939,
      "end_line": 973,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 940,
      "end_line": 940,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField.TwoDigitMonthField()",
      "begin_line": 945,
      "end_line": 947,
      "comment": "\n         * Constructs an instance of {@code TwoDigitMonthField}.\n         ",
      "child_ranges": [
        "(line 946,col 13)-(line 946,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField.estimateLength()",
      "begin_line": 952,
      "end_line": 955,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 954,col 13)-(line 954,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 960,
      "end_line": 963,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 962,col 13)-(line 962,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 968,
      "end_line": 972,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 970,col 13)-(line 970,col 52)",
        "(line 971,col 13)-(line 971,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwelveHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 978,
      "end_line": 1018,
      "comment": "\n     * \u003cp\u003eInner class to output the twelve hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 979,
      "end_line": 979,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwelveHourField.TwelveHourField(org.apache.commons.lang3.time.FastDatePrinter.NumberRule)",
      "begin_line": 987,
      "end_line": 989,
      "comment": "\n         * Constructs an instance of {@code TwelveHourField} with the specified\n         * {@code NumberRule}.\n         *\n         * @param rule the rule\n         ",
      "child_ranges": [
        "(line 988,col 13)-(line 988,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwelveHourField.estimateLength()",
      "begin_line": 994,
      "end_line": 997,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 996,col 13)-(line 996,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwelveHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1002,
      "end_line": 1009,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1004,col 13)-(line 1004,col 52)",
        "(line 1005,col 13)-(line 1007,col 13)",
        "(line 1008,col 13)-(line 1008,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwelveHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1014,
      "end_line": 1017,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1016,col 13)-(line 1016,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwentyFourHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 1023,
      "end_line": 1063,
      "comment": "\n     * \u003cp\u003eInner class to output the twenty four hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 1024,
      "end_line": 1024,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwentyFourHourField.TwentyFourHourField(org.apache.commons.lang3.time.FastDatePrinter.NumberRule)",
      "begin_line": 1032,
      "end_line": 1034,
      "comment": "\n         * Constructs an instance of {@code TwentyFourHourField} with the specified\n         * {@code NumberRule}.\n         *\n         * @param rule the rule\n         ",
      "child_ranges": [
        "(line 1033,col 13)-(line 1033,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwentyFourHourField.estimateLength()",
      "begin_line": 1039,
      "end_line": 1042,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1041,col 13)-(line 1041,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwentyFourHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1047,
      "end_line": 1054,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1049,col 13)-(line 1049,col 59)",
        "(line 1050,col 13)-(line 1052,col 13)",
        "(line 1053,col 13)-(line 1053,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwentyFourHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1059,
      "end_line": 1062,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1061,col 13)-(line 1061,col 42)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "cTimeZoneDisplayCache"
      ],
      "begin_line": 1067,
      "end_line": 1068,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 1078,
      "end_line": 1090,
      "comment": "\n     * \u003cp\u003eGets the time zone display name, using a cache for performance.\u003c/p\u003e\n     *\n     * @param tz  the zone to query\n     * @param daylight  true if daylight savings\n     * @param style  the style to use {@code TimeZone.LONG} or {@code TimeZone.SHORT}\n     * @param locale  the locale to use\n     * @return the textual name of the time zone\n     ",
      "child_ranges": [
        "(line 1079,col 9)-(line 1079,col 85)",
        "(line 1080,col 9)-(line 1080,col 54)",
        "(line 1081,col 9)-(line 1088,col 9)",
        "(line 1089,col 9)-(line 1089,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNameRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.Rule"
      ],
      "begin_line": 1095,
      "end_line": 1133,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone name.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1096,
      "end_line": 1096,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStandard"
      ],
      "begin_line": 1097,
      "end_line": 1097,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mDaylight"
      ],
      "begin_line": 1098,
      "end_line": 1098,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNameRule.TimeZoneNameRule(java.util.TimeZone, java.util.Locale, int)",
      "begin_line": 1107,
      "end_line": 1112,
      "comment": "\n         * Constructs an instance of {@code TimeZoneNameRule} with the specified properties.\n         *\n         * @param timeZone the time zone\n         * @param locale the locale\n         * @param style the style\n         ",
      "child_ranges": [
        "(line 1108,col 13)-(line 1108,col 33)",
        "(line 1110,col 13)-(line 1110,col 75)",
        "(line 1111,col 13)-(line 1111,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNameRule.estimateLength()",
      "begin_line": 1117,
      "end_line": 1120,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1119,col 13)-(line 1119,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNameRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1125,
      "end_line": 1132,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1127,col 13)-(line 1131,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNumberRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.Rule"
      ],
      "begin_line": 1139,
      "end_line": 1188,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone as a number {@code +/-HHMM}\n     * or {@code +/-HH:MM}.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_COLON"
      ],
      "begin_line": 1140,
      "end_line": 1140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_NO_COLON"
      ],
      "begin_line": 1141,
      "end_line": 1141,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mColon"
      ],
      "begin_line": 1143,
      "end_line": 1143,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule.TimeZoneNumberRule(boolean)",
      "begin_line": 1150,
      "end_line": 1152,
      "comment": "\n         * Constructs an instance of {@code TimeZoneNumberRule} with the specified properties.\n         *\n         * @param colon add colon between HH and MM in the output if {@code true}\n         ",
      "child_ranges": [
        "(line 1151,col 13)-(line 1151,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule.estimateLength()",
      "begin_line": 1157,
      "end_line": 1160,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1159,col 13)-(line 1159,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1165,
      "end_line": 1187,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1167,col 13)-(line 1167,col 96)",
        "(line 1169,col 13)-(line 1174,col 13)",
        "(line 1176,col 13)-(line 1176,col 50)",
        "(line 1177,col 13)-(line 1177,col 52)",
        "(line 1178,col 13)-(line 1178,col 52)",
        "(line 1180,col 13)-(line 1182,col 13)",
        "(line 1184,col 13)-(line 1184,col 60)",
        "(line 1185,col 13)-(line 1185,col 54)",
        "(line 1186,col 13)-(line 1186,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneDisplayKey",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1194,
      "end_line": 1242,
      "comment": "\n     * \u003cp\u003eInner class that acts as a compound key for time zone names.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1195,
      "end_line": 1195,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStyle"
      ],
      "begin_line": 1196,
      "end_line": 1196,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 1197,
      "end_line": 1197,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey.TimeZoneDisplayKey(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 1207,
      "end_line": 1215,
      "comment": "\n         * Constructs an instance of {@code TimeZoneDisplayKey} with the specified properties.\n         *\n         * @param timeZone the time zone\n         * @param daylight adjust the style for daylight saving time if {@code true}\n         * @param style the timezone style\n         * @param locale the timezone locale\n         ",
      "child_ranges": [
        "(line 1209,col 13)-(line 1209,col 33)",
        "(line 1210,col 13)-(line 1212,col 13)",
        "(line 1213,col 13)-(line 1213,col 27)",
        "(line 1214,col 13)-(line 1214,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey.hashCode()",
      "begin_line": 1220,
      "end_line": 1223,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1222,col 13)-(line 1222,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey.equals(java.lang.Object)",
      "begin_line": 1228,
      "end_line": 1241,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1230,col 13)-(line 1232,col 13)",
        "(line 1233,col 13)-(line 1239,col 13)",
        "(line 1240,col 13)-(line 1240,col 25)"
      ]
    }
  ]
}