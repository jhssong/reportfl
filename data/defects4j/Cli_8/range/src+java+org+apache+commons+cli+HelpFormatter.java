{
  "filepath": "/tmp/Cli-8b/src/java/org/apache/commons/cli/HelpFormatter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HelpFormatter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 957,
      "comment": " \n * A formatter of help messages for the current command line options\n *\n * @author Slawek Zachcial\n * @author John Keyes (john at integralsource.com)\n *"
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_WIDTH"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " default number of characters per line "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LEFT_PAD"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " default padding to the left of each line "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DESC_PAD"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * the number of characters of padding to be prefixed\n     * to each description line\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SYNTAX_PREFIX"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " the string to display at the begining of the usage statement "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OPT_PREFIX"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " default prefix for shortOpts "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LONG_OPT_PREFIX"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " default prefix for long Option "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ARG_NAME"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " default name for an argument "
    },
    {
      "type": "field",
      "varNames": [
        "defaultWidth"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * number of characters per line\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setWidth methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultLeftPad"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * amount of padding to the left of each line\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setLeftPadding methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultDescPad"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * the number of characters of padding to be prefixed\n     * to each description line\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setDescPadding methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultSyntaxPrefix"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * the string to display at the begining of the usage statement\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setSyntaxPrefix methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultNewLine"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * the new line string\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setNewLine methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultOptPrefix"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n     * the shortOpt prefix\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setOptPrefix methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultLongOptPrefix"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * the long Opt prefix\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setLongOptPrefix methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultArgName"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n     * the name of the argument\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setArgName methods instead.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setWidth(int)",
      "begin_line": 133,
      "end_line": 136,
      "comment": "\n     * Sets the \u0027width\u0027.\n     *\n     * @param width the new value of \u0027width\u0027\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getWidth()",
      "begin_line": 143,
      "end_line": 146,
      "comment": "\n     * Returns the \u0027width\u0027.\n     *\n     * @return the \u0027width\u0027\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLeftPadding(int)",
      "begin_line": 153,
      "end_line": 156,
      "comment": "\n     * Sets the \u0027leftPadding\u0027.\n     *\n     * @param padding the new value of \u0027leftPadding\u0027\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLeftPadding()",
      "begin_line": 163,
      "end_line": 166,
      "comment": "\n     * Returns the \u0027leftPadding\u0027.\n     *\n     * @return the \u0027leftPadding\u0027\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setDescPadding(int)",
      "begin_line": 173,
      "end_line": 176,
      "comment": "\n     * Sets the \u0027descPadding\u0027.\n     *\n     * @param padding the new value of \u0027descPadding\u0027\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getDescPadding()",
      "begin_line": 183,
      "end_line": 186,
      "comment": "\n     * Returns the \u0027descPadding\u0027.\n     *\n     * @return the \u0027descPadding\u0027\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setSyntaxPrefix(java.lang.String)",
      "begin_line": 193,
      "end_line": 196,
      "comment": "\n     * Sets the \u0027syntaxPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027syntaxPrefix\u0027\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getSyntaxPrefix()",
      "begin_line": 203,
      "end_line": 206,
      "comment": "\n     * Returns the \u0027syntaxPrefix\u0027.\n     *\n     * @return the \u0027syntaxPrefix\u0027\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setNewLine(java.lang.String)",
      "begin_line": 213,
      "end_line": 216,
      "comment": "\n     * Sets the \u0027newLine\u0027.\n     *\n     * @param newline the new value of \u0027newLine\u0027\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getNewLine()",
      "begin_line": 223,
      "end_line": 226,
      "comment": "\n     * Returns the \u0027newLine\u0027.\n     *\n     * @return the \u0027newLine\u0027\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setOptPrefix(java.lang.String)",
      "begin_line": 233,
      "end_line": 236,
      "comment": "\n     * Sets the \u0027optPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027optPrefix\u0027\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getOptPrefix()",
      "begin_line": 243,
      "end_line": 246,
      "comment": "\n     * Returns the \u0027optPrefix\u0027.\n     *\n     * @return the \u0027optPrefix\u0027\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLongOptPrefix(java.lang.String)",
      "begin_line": 253,
      "end_line": 256,
      "comment": "\n     * Sets the \u0027longOptPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027longOptPrefix\u0027\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLongOptPrefix()",
      "begin_line": 263,
      "end_line": 266,
      "comment": "\n     * Returns the \u0027longOptPrefix\u0027.\n     *\n     * @return the \u0027longOptPrefix\u0027\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setArgName(java.lang.String)",
      "begin_line": 273,
      "end_line": 276,
      "comment": "\n     * Sets the \u0027argName\u0027.\n     *\n     * @param name the new value of \u0027argName\u0027\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getArgName()",
      "begin_line": 283,
      "end_line": 286,
      "comment": "\n     * Returns the \u0027argName\u0027.\n     *\n     * @return the \u0027argName\u0027\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, org.apache.commons.cli.Options)",
      "begin_line": 299,
      "end_line": 302,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\u003c/p\u003e\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param options the Options instance\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, org.apache.commons.cli.Options, boolean)",
      "begin_line": 314,
      "end_line": 318,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to \n     * System.out.\u003c/p\u003e\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param options the Options instance\n     * @param autoUsage whether to print an automatically generated \n     * usage statement\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String)",
      "begin_line": 330,
      "end_line": 334,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\u003c/p\u003e\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String, boolean)",
      "begin_line": 348,
      "end_line": 353,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to \n     * System.out.\u003c/p\u003e\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated \n     * usage statement\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 352,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String)",
      "begin_line": 366,
      "end_line": 370,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\u003c/p\u003e\n     *\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String, boolean)",
      "begin_line": 385,
      "end_line": 393,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\u003c/p\u003e\n     *\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated \n     * usage statement\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 53)",
        "(line 390,col 9)-(line 391,col 53)",
        "(line 392,col 9)-(line 392,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String)",
      "begin_line": 410,
      "end_line": 416,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.\u003c/p\u003e\n     *\n     * @param pw the writer to which the help will be written\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     * @param footer the banner to display at the end of the help\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 415,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String, boolean)",
      "begin_line": 436,
      "end_line": 465,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.\u003c/p\u003e\n     *\n     * @param pw the writer to which the help will be written\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated \n     * usage statement\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 443,col 9)",
        "(line 445,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 457,col 9)",
        "(line 459,col 9)-(line 459,col 59)",
        "(line 461,col 9)-(line 464,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printUsage(java.io.PrintWriter, int, java.lang.String, org.apache.commons.cli.Options)",
      "begin_line": 476,
      "end_line": 534,
      "comment": "\n     * \u003cp\u003ePrints the usage statement for the specified application.\u003c/p\u003e\n     *\n     * @param pw The PrintWriter to print the usage statement \n     * @param width The number of characters to display per line\n     * @param app The application name\n     * @param options The command line Options\n     *\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 481,col 78)",
        "(line 484,col 9)-(line 484,col 59)",
        "(line 487,col 9)-(line 487,col 22)",
        "(line 489,col 9)-(line 489,col 59)",
        "(line 490,col 9)-(line 490,col 58)",
        "(line 492,col 9)-(line 528,col 9)",
        "(line 532,col 9)-(line 533,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.appendOptionGroup(java.lang.StringBuffer, org.apache.commons.cli.OptionGroup)",
      "begin_line": 544,
      "end_line": 570,
      "comment": "\n     * Appends the usage clause for an OptionGroup to a StringBuffer.  \n     * The clause is wrapped in square brackets if the group is required.\n     * The display of the options is handled by appendOption\n     * @param buff the StringBuffer to append to\n     * @param group the group to append\n     * @see #appendOption(StringBuffer,Option,boolean)\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 550,col 9)",
        "(line 552,col 9)-(line 552,col 57)",
        "(line 553,col 9)-(line 553,col 58)",
        "(line 555,col 9)-(line 564,col 9)",
        "(line 566,col 9)-(line 569,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.appendOption(java.lang.StringBuffer, org.apache.commons.cli.Option, boolean)",
      "begin_line": 579,
      "end_line": 608,
      "comment": "\n     * Appends the usage clause for an Option to a StringBuffer.  \n     *\n     * @param buff the StringBuffer to append to\n     * @param option the Option to append\n     * @param required whether the Option is required or not\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 586,col 9)",
        "(line 588,col 9)-(line 595,col 9)",
        "(line 598,col 9)-(line 601,col 9)",
        "(line 604,col 9)-(line 607,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printUsage(java.io.PrintWriter, int, java.lang.String)",
      "begin_line": 618,
      "end_line": 624,
      "comment": "\n     * \u003cp\u003ePrint the cmdLineSyntax to the specified writer, using the\n     * specified width.\u003c/p\u003e\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters per line for the usage statement.\n     * @param cmdLineSyntax The usage statement.\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 52)",
        "(line 622,col 9)-(line 623,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printOptions(java.io.PrintWriter, int, org.apache.commons.cli.Options, int, int)",
      "begin_line": 638,
      "end_line": 645,
      "comment": "\n     * \u003cp\u003ePrint the help for the specified Options to the specified writer, \n     * using the specified width, left padding and description padding.\u003c/p\u003e\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param options The command line Options\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 45)",
        "(line 643,col 9)-(line 643,col 60)",
        "(line 644,col 9)-(line 644,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printWrapped(java.io.PrintWriter, int, java.lang.String)",
      "begin_line": 654,
      "end_line": 657,
      "comment": "\n     * \u003cp\u003ePrint the specified text to the specified PrintWriter.\u003c/p\u003e\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param text The text to be written to the PrintWriter\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printWrapped(java.io.PrintWriter, int, int, java.lang.String)",
      "begin_line": 667,
      "end_line": 674,
      "comment": "\n     * \u003cp\u003ePrint the specified text to the specified PrintWriter.\u003c/p\u003e\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param nextLineTabStop The position on the next line for the first tab.\n     * @param text The text to be written to the PrintWriter\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 58)",
        "(line 672,col 9)-(line 672,col 60)",
        "(line 673,col 9)-(line 673,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.renderOptions(java.lang.StringBuffer, int, org.apache.commons.cli.Options, int, int)",
      "begin_line": 692,
      "end_line": 779,
      "comment": "\n     * \u003cp\u003eRender the specified Options and return the rendered Options\n     * in a StringBuffer.\u003c/p\u003e\n     *\n     * @param sb The StringBuffer to place the rendered Options into.\n     * @param width The number of characters to display per line\n     * @param options The command line Options\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     *\n     * @return the StringBuffer with the rendered Options contents.\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 51)",
        "(line 697,col 9)-(line 697,col 51)",
        "(line 703,col 9)-(line 703,col 20)",
        "(line 704,col 9)-(line 704,col 28)",
        "(line 705,col 9)-(line 705,col 42)",
        "(line 706,col 9)-(line 706,col 22)",
        "(line 707,col 9)-(line 707,col 45)",
        "(line 709,col 9)-(line 709,col 58)",
        "(line 711,col 9)-(line 747,col 9)",
        "(line 749,col 9)-(line 749,col 18)",
        "(line 751,col 9)-(line 776,col 9)",
        "(line 778,col 9)-(line 778,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.renderWrappedText(java.lang.StringBuffer, int, int, java.lang.String)",
      "begin_line": 792,
      "end_line": 823,
      "comment": "\n     * \u003cp\u003eRender the specified text and return the rendered Options\n     * in a StringBuffer.\u003c/p\u003e\n     *\n     * @param sb The StringBuffer to place the rendered text into.\n     * @param width The number of characters to display per line\n     * @param nextLineTabStop The position on the next line for the first tab.\n     * @param text The text to be rendered.\n     *\n     * @return the StringBuffer with the rendered Options contents.\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 46)",
        "(line 797,col 9)-(line 802,col 9)",
        "(line 803,col 9)-(line 803,col 72)",
        "(line 807,col 9)-(line 807,col 62)",
        "(line 809,col 9)-(line 822,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.findWrapPos(java.lang.String, int, int)",
      "begin_line": 838,
      "end_line": 882,
      "comment": "\n     * Finds the next text wrap position after \u003ccode\u003estartPos\u003c/code\u003e for the \n     * text in \u003ccode\u003etext\u003c/code\u003e with the column width \u003ccode\u003ewidth\u003c/code\u003e.\n     * The wrap point is the last postion before startPos+width having a \n     * whitespace character (space, \\n, \\r).\n     *\n     * @param text The text being searched for the wrap position\n     * @param width width of the wrapped text\n     * @param startPos position from which to start the lookup whitespace \n     * character\n     * @return postion on which the text must be wrapped or -1 if the wrap \n     * position is at the end of the text\n     ",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 21)",
        "(line 843,col 9)-(line 851,col 9)",
        "(line 855,col 9)-(line 855,col 31)",
        "(line 857,col 9)-(line 857,col 15)",
        "(line 859,col 9)-(line 863,col 9)",
        "(line 866,col 9)-(line 869,col 9)",
        "(line 873,col 9)-(line 873,col 31)",
        "(line 875,col 9)-(line 879,col 9)",
        "(line 881,col 9)-(line 881,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.createPadding(int)",
      "begin_line": 891,
      "end_line": 901,
      "comment": "\n     * \u003cp\u003eReturn a String of padding of length \u003ccode\u003elen\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param len The length of the String of padding to create.\n     *\n     * @return The String of padding\n     ",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 48)",
        "(line 895,col 9)-(line 898,col 9)",
        "(line 900,col 9)-(line 900,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.rtrim(java.lang.String)",
      "begin_line": 910,
      "end_line": 925,
      "comment": "\n     * \u003cp\u003eRemove the trailing whitespace from the specified String.\u003c/p\u003e\n     *\n     * @param s The String to remove the trailing padding from.\n     *\n     * @return The String of without the trailing padding\n     ",
      "child_ranges": [
        "(line 912,col 9)-(line 915,col 9)",
        "(line 917,col 9)-(line 917,col 29)",
        "(line 919,col 9)-(line 922,col 9)",
        "(line 924,col 9)-(line 924,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OptionComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 934,
      "end_line": 956,
      "comment": "\n     * \u003cp\u003eThis class implements the \u003ccode\u003eComparator\u003c/code\u003e interface\n     * for comparing Options.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.OptionComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 949,
      "end_line": 955,
      "comment": "\n         * \u003cp\u003eCompares its two arguments for order. Returns a negative \n         * integer, zero, or a positive integer as the first argument \n         * is less than, equal to, or greater than the second.\u003c/p\u003e\n         *\n         * @param o1 The first Option to be compared.\n         * @param o2 The second Option to be compared.\n         *\n         * @return a negative integer, zero, or a positive integer as \n         * the first argument is less than, equal to, or greater than the \n         * second.\n         ",
      "child_ranges": [
        "(line 951,col 13)-(line 951,col 37)",
        "(line 952,col 13)-(line 952,col 37)",
        "(line 954,col 13)-(line 954,col 68)"
      ]
    }
  ]
}