{
  "filepath": "/tmp/Cli-21b/src/java/org/apache/commons/cli2/util/HelpFormatter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HelpFormatter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 638,
      "comment": "\n * Presents on screen help based on the application\u0027s Options\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FULL_WIDTH"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * The default screen width\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GUTTER_LEFT"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * The default screen furniture left of screen\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GUTTER_CENTER"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * The default screen furniture right of screen\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GUTTER_RIGHT"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * The default screen furniture between columns\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FULL_USAGE_SETTINGS"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * The default DisplaySettings used to select the elements to display in the\n     * displayed line of full usage information.\n     *\n     * @see DisplaySetting\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LINE_USAGE_SETTINGS"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * The default DisplaySettings used to select the elements of usage per help\n     * line in the main body of help\n     *\n     * @see DisplaySetting\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DISPLAY_USAGE_SETTINGS"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * The default DisplaySettings used to select the help lines in the main\n     * body of help\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fullUsageSettings"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineUsageSettings"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "displaySettings"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exception"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "group"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "comparator"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "divider"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "header"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "footer"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shellCommand"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gutterLeft"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "or should this default to .err?"
    },
    {
      "type": "field",
      "varNames": [
        "gutterCenter"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gutterRight"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pageWidth"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.HelpFormatter()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Creates a new HelpFormatter using the defaults\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 99)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.HelpFormatter(java.lang.String, java.lang.String, java.lang.String, int)",
      "begin_line": 132,
      "end_line": 154,
      "comment": "\n     * Creates a new HelpFormatter using the specified parameters\n     * @param gutterLeft the string marking left of screen\n     * @param gutterCenter the string marking center of screen\n     * @param gutterRight the string marking right of screen\n     * @param fullWidth the width of the screen\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 82)",
        "(line 140,col 9)-(line 140,col 90)",
        "(line 143,col 9)-(line 143,col 86)",
        "(line 146,col 9)-(line 146,col 90)",
        "(line 149,col 9)-(line 149,col 80)",
        "(line 151,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.print()",
      "begin_line": 159,
      "end_line": 166,
      "comment": "\n     * Prints the Option help.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 22)",
        "(line 161,col 9)-(line 161,col 25)",
        "(line 162,col 9)-(line 162,col 21)",
        "(line 163,col 9)-(line 163,col 20)",
        "(line 164,col 9)-(line 164,col 22)",
        "(line 165,col 9)-(line 165,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.printException()",
      "begin_line": 171,
      "end_line": 176,
      "comment": "\n     * Prints any error message.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 175,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.printHelp()",
      "begin_line": 181,
      "end_line": 245,
      "comment": "\n     * Prints detailed help per option.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 23)",
        "(line 184,col 9)-(line 184,col 28)",
        "(line 186,col 9)-(line 190,col 9)",
        "(line 193,col 9)-(line 193,col 80)",
        "(line 196,col 9)-(line 196,col 27)",
        "(line 198,col 9)-(line 202,col 9)",
        "(line 205,col 9)-(line 205,col 60)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 212,col 9)-(line 212,col 97)",
        "(line 215,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 244,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.printUsage()",
      "begin_line": 250,
      "end_line": 257,
      "comment": "\n     * Prints a single line of usage information (wrapping if necessary)\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 23)",
        "(line 253,col 9)-(line 253,col 65)",
        "(line 254,col 9)-(line 254,col 48)",
        "(line 255,col 9)-(line 255,col 70)",
        "(line 256,col 9)-(line 256,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.printHeader()",
      "begin_line": 262,
      "end_line": 267,
      "comment": "\n     * Prints a header string if necessary\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.printFooter()",
      "begin_line": 272,
      "end_line": 277,
      "comment": "\n     * Prints a footer string if necessary\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.printWrapped(java.lang.String)",
      "begin_line": 283,
      "end_line": 292,
      "comment": "\n     * Prints a string wrapped if necessary\n     * @param text the string to wrap\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 289,col 9)",
        "(line 291,col 9)-(line 291,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.printGutterLeft()",
      "begin_line": 297,
      "end_line": 301,
      "comment": "\n     * Prints the left gutter string\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 300,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.printGutterRight()",
      "begin_line": 306,
      "end_line": 310,
      "comment": "\n     * Prints the right gutter string\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 309,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.printDivider()",
      "begin_line": 315,
      "end_line": 319,
      "comment": "\n     * Prints the divider text\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 318,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.pad(java.lang.String, int, java.io.PrintWriter)",
      "begin_line": 321,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 23)",
        "(line 327,col 9)-(line 332,col 9)",
        "(line 335,col 9)-(line 337,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.wrap(java.lang.String, int)",
      "begin_line": 340,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 348,col 9)",
        "(line 351,col 9)-(line 353,col 9)",
        "(line 355,col 9)-(line 355,col 43)",
        "(line 356,col 9)-(line 356,col 48)",
        "(line 357,col 9)-(line 357,col 21)",
        "(line 360,col 9)-(line 435,col 9)",
        "(line 437,col 9)-(line 437,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.setComparator(java.util.Comparator)",
      "begin_line": 444,
      "end_line": 446,
      "comment": "\n     * The Comparator to use when sorting Options\n     * @param comparator Comparator to use when sorting Options\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.setDisplaySettings(java.util.Set)",
      "begin_line": 455,
      "end_line": 457,
      "comment": "\n     * The DisplaySettings used to select the help lines in the main body of\n     * help\n     *\n     * @param displaySettings the settings to use\n     * @see DisplaySetting\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.setDivider(java.lang.String)",
      "begin_line": 463,
      "end_line": 465,
      "comment": "\n     * Sets the string to use as a divider between sections of help\n     * @param divider the dividing string\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.setException(org.apache.commons.cli2.OptionException)",
      "begin_line": 471,
      "end_line": 473,
      "comment": "\n     * Sets the exception to document\n     * @param exception the exception that occured\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.setFooter(java.lang.String)",
      "begin_line": 479,
      "end_line": 481,
      "comment": "\n     * Sets the footer text of the help screen\n     * @param footer the footer text\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.setFullUsageSettings(java.util.Set)",
      "begin_line": 489,
      "end_line": 491,
      "comment": "\n     * The DisplaySettings used to select the elements to display in the\n     * displayed line of full usage information.\n     * @see DisplaySetting\n     * @param fullUsageSettings\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.setGroup(org.apache.commons.cli2.Group)",
      "begin_line": 497,
      "end_line": 499,
      "comment": "\n     * Sets the Group of Options to document\n     * @param group the options to document\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.setHeader(java.lang.String)",
      "begin_line": 505,
      "end_line": 507,
      "comment": "\n     * Sets the footer text of the help screen\n     * @param header the footer text\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.setLineUsageSettings(java.util.Set)",
      "begin_line": 515,
      "end_line": 517,
      "comment": "\n     * Sets the DisplaySettings used to select elements in the per helpline\n     * usage strings.\n     * @see DisplaySetting\n     * @param lineUsageSettings the DisplaySettings to use\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.setShellCommand(java.lang.String)",
      "begin_line": 523,
      "end_line": 525,
      "comment": "\n     * Sets the command string used to invoke the application\n     * @param shellCommand the invokation command\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.getComparator()",
      "begin_line": 530,
      "end_line": 532,
      "comment": "\n     * @return the Comparator used to sort the Group\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.getDisplaySettings()",
      "begin_line": 537,
      "end_line": 539,
      "comment": "\n     * @return the DisplaySettings used to select HelpLines\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.getDivider()",
      "begin_line": 544,
      "end_line": 546,
      "comment": "\n     * @return the String used as a horizontal section divider\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.getException()",
      "begin_line": 551,
      "end_line": 553,
      "comment": "\n     * @return the Exception being documented by this HelpFormatter\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.getFooter()",
      "begin_line": 558,
      "end_line": 560,
      "comment": "\n     * @return the help screen footer text\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.getFullUsageSettings()",
      "begin_line": 565,
      "end_line": 567,
      "comment": "\n     * @return the DisplaySettings used in the full usage string\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.getGroup()",
      "begin_line": 572,
      "end_line": 574,
      "comment": "\n     * @return the group documented by this HelpFormatter\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.getGutterCenter()",
      "begin_line": 579,
      "end_line": 581,
      "comment": "\n     * @return the String used as the central gutter\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.getGutterLeft()",
      "begin_line": 586,
      "end_line": 588,
      "comment": "\n     * @return the String used as the left gutter\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.getGutterRight()",
      "begin_line": 593,
      "end_line": 595,
      "comment": "\n     * @return the String used as the right gutter\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.getHeader()",
      "begin_line": 600,
      "end_line": 602,
      "comment": "\n     * @return the help screen header text\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.getLineUsageSettings()",
      "begin_line": 607,
      "end_line": 609,
      "comment": "\n     * @return the DisplaySettings used in the per help line usage strings\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.getPageWidth()",
      "begin_line": 614,
      "end_line": 616,
      "comment": "\n     * @return the width of the screen in characters\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.getShellCommand()",
      "begin_line": 621,
      "end_line": 623,
      "comment": "\n     * @return the command used to execute the application\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.setPrintWriter(java.io.PrintWriter)",
      "begin_line": 628,
      "end_line": 630,
      "comment": "\n     * @param out the PrintWriter to write to\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.HelpFormatter.getPrintWriter()",
      "begin_line": 635,
      "end_line": 637,
      "comment": "\n     * @return the PrintWriter that will be written to\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 19)"
      ]
    }
  ]
}