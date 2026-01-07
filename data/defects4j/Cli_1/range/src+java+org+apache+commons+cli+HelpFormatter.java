{
  "filepath": "/tmp/Cli-1b/src/java/org/apache/commons/cli/HelpFormatter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HelpFormatter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 908,
      "comment": " \n * A formatter of help messages for the current command line options\n *\n * @author Slawek Zachcial\n * @author John Keyes (john at integralsource.com)\n *"
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_WIDTH"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " default number of characters per line "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LEFT_PAD"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " default padding to the left of each line "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DESC_PAD"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " ?? "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SYNTAX_PREFIX"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " the string to display at the begining of the usage statement "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OPT_PREFIX"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " default prefix for shortOpts "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LONG_OPT_PREFIX"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " default prefix for long Option "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ARG_NAME"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " default name for an argument "
    },
    {
      "type": "field",
      "varNames": [
        "defaultWidth"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " number of characters per line "
    },
    {
      "type": "field",
      "varNames": [
        "defaultLeftPad"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " amount of padding to the left of each line "
    },
    {
      "type": "field",
      "varNames": [
        "defaultDescPad"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " ?? "
    },
    {
      "type": "field",
      "varNames": [
        "defaultSyntaxPrefix"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " the string to display at the begining of the usage statement "
    },
    {
      "type": "field",
      "varNames": [
        "defaultNewLine"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " the new line character/string ?? "
    },
    {
      "type": "field",
      "varNames": [
        "defaultOptPrefix"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " the shortOpt prefix "
    },
    {
      "type": "field",
      "varNames": [
        "defaultLongOptPrefix"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " the long Opt prefix "
    },
    {
      "type": "field",
      "varNames": [
        "defaultArgName"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " the name of the argument "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setWidth(int)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\n     * Sets the \u0027width\u0027.\n     *\n     * @param width the new value of \u0027width\u0027\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getWidth()",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * Returns the \u0027width\u0027.\n     *\n     * @return the \u0027width\u0027\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLeftPadding(int)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Sets the \u0027leftPadding\u0027.\n     *\n     * @param padding the new value of \u0027leftPadding\u0027\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLeftPadding()",
      "begin_line": 118,
      "end_line": 121,
      "comment": "\n     * Returns the \u0027leftPadding\u0027.\n     *\n     * @return the \u0027leftPadding\u0027\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setDescPadding(int)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\n     * Sets the \u0027descPadding\u0027.\n     *\n     * @param padding the new value of \u0027descPadding\u0027\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getDescPadding()",
      "begin_line": 138,
      "end_line": 141,
      "comment": "\n     * Returns the \u0027descPadding\u0027.\n     *\n     * @return the \u0027descPadding\u0027\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setSyntaxPrefix(java.lang.String)",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * Sets the \u0027syntaxPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027syntaxPrefix\u0027\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getSyntaxPrefix()",
      "begin_line": 158,
      "end_line": 161,
      "comment": "\n     * Returns the \u0027syntaxPrefix\u0027.\n     *\n     * @return the \u0027syntaxPrefix\u0027\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setNewLine(java.lang.String)",
      "begin_line": 168,
      "end_line": 171,
      "comment": "\n     * Sets the \u0027newLine\u0027.\n     *\n     * @param newline the new value of \u0027newLine\u0027\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getNewLine()",
      "begin_line": 178,
      "end_line": 181,
      "comment": "\n     * Returns the \u0027newLine\u0027.\n     *\n     * @return the \u0027newLine\u0027\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setOptPrefix(java.lang.String)",
      "begin_line": 188,
      "end_line": 191,
      "comment": "\n     * Sets the \u0027optPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027optPrefix\u0027\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getOptPrefix()",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\n     * Returns the \u0027optPrefix\u0027.\n     *\n     * @return the \u0027optPrefix\u0027\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLongOptPrefix(java.lang.String)",
      "begin_line": 208,
      "end_line": 211,
      "comment": "\n     * Sets the \u0027longOptPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027longOptPrefix\u0027\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLongOptPrefix()",
      "begin_line": 218,
      "end_line": 221,
      "comment": "\n     * Returns the \u0027longOptPrefix\u0027.\n     *\n     * @return the \u0027longOptPrefix\u0027\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setArgName(java.lang.String)",
      "begin_line": 228,
      "end_line": 231,
      "comment": "\n     * Sets the \u0027argName\u0027.\n     *\n     * @param name the new value of \u0027argName\u0027\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getArgName()",
      "begin_line": 238,
      "end_line": 241,
      "comment": "\n     * Returns the \u0027argName\u0027.\n     *\n     * @return the \u0027argName\u0027\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, org.apache.commons.cli.Options)",
      "begin_line": 254,
      "end_line": 257,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\u003c/p\u003e\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param options the Options instance\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, org.apache.commons.cli.Options, boolean)",
      "begin_line": 269,
      "end_line": 273,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to \n     * System.out.\u003c/p\u003e\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param options the Options instance\n     * @param autoUsage whether to print an automatically generated \n     * usage statement\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String)",
      "begin_line": 285,
      "end_line": 289,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\u003c/p\u003e\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String, boolean)",
      "begin_line": 303,
      "end_line": 308,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to \n     * System.out.\u003c/p\u003e\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated \n     * usage statement\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 307,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String)",
      "begin_line": 321,
      "end_line": 325,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\u003c/p\u003e\n     *\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String, boolean)",
      "begin_line": 340,
      "end_line": 348,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\u003c/p\u003e\n     *\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated \n     * usage statement\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 53)",
        "(line 345,col 9)-(line 346,col 53)",
        "(line 347,col 9)-(line 347,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String)",
      "begin_line": 365,
      "end_line": 371,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.\u003c/p\u003e\n     *\n     * @param pw the writer to which the help will be written\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     * @param footer the banner to display at the end of the help\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 370,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String, boolean)",
      "begin_line": 391,
      "end_line": 420,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.\u003c/p\u003e\n     *\n     * @param pw the writer to which the help will be written\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated \n     * usage statement\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 398,col 9)",
        "(line 400,col 9)-(line 407,col 9)",
        "(line 409,col 9)-(line 412,col 9)",
        "(line 414,col 9)-(line 414,col 59)",
        "(line 416,col 9)-(line 419,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printUsage(java.io.PrintWriter, int, java.lang.String, org.apache.commons.cli.Options)",
      "begin_line": 431,
      "end_line": 487,
      "comment": "\n     * \u003cp\u003ePrints the usage statement for the specified application.\u003c/p\u003e\n     *\n     * @param pw The PrintWriter to print the usage statement \n     * @param width The number of characters to display per line\n     * @param app The application name\n     * @param options The command line Options\n     *\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 436,col 78)",
        "(line 439,col 9)-(line 439,col 59)",
        "(line 442,col 9)-(line 442,col 22)",
        "(line 445,col 9)-(line 481,col 9)",
        "(line 485,col 9)-(line 486,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.appendOptionGroup(java.lang.StringBuffer, org.apache.commons.cli.OptionGroup)",
      "begin_line": 497,
      "end_line": 521,
      "comment": "\n     * Appends the usage clause for an OptionGroup to a StringBuffer.  \n     * The clause is wrapped in square brackets if the group is required.\n     * The display of the options is handled by appendOption\n     * @param buff the StringBuffer to append to\n     * @param group the group to append\n     * @see #appendOption(StringBuffer,Option,boolean)\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 503,col 9)",
        "(line 506,col 9)-(line 515,col 9)",
        "(line 517,col 9)-(line 520,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.appendOption(java.lang.StringBuffer, org.apache.commons.cli.Option, boolean)",
      "begin_line": 530,
      "end_line": 559,
      "comment": "\n     * Appends the usage clause for an Option to a StringBuffer.  \n     *\n     * @param buff the StringBuffer to append to\n     * @param option the Option to append\n     * @param required whether the Option is required or not\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 537,col 9)",
        "(line 539,col 9)-(line 546,col 9)",
        "(line 549,col 9)-(line 552,col 9)",
        "(line 555,col 9)-(line 558,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printUsage(java.io.PrintWriter, int, java.lang.String)",
      "begin_line": 569,
      "end_line": 575,
      "comment": "\n     * \u003cp\u003ePrint the cmdLineSyntax to the specified writer, using the\n     * specified width.\u003c/p\u003e\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters per line for the usage statement.\n     * @param cmdLineSyntax The usage statement.\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 52)",
        "(line 573,col 9)-(line 574,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printOptions(java.io.PrintWriter, int, org.apache.commons.cli.Options, int, int)",
      "begin_line": 589,
      "end_line": 596,
      "comment": "\n     * \u003cp\u003ePrint the help for the specified Options to the specified writer, \n     * using the specified width, left padding and description padding.\u003c/p\u003e\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param options The command line Options\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 45)",
        "(line 594,col 9)-(line 594,col 60)",
        "(line 595,col 9)-(line 595,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printWrapped(java.io.PrintWriter, int, java.lang.String)",
      "begin_line": 605,
      "end_line": 608,
      "comment": "\n     * \u003cp\u003ePrint the specified text to the specified PrintWriter.\u003c/p\u003e\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param text The text to be written to the PrintWriter\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printWrapped(java.io.PrintWriter, int, int, java.lang.String)",
      "begin_line": 618,
      "end_line": 625,
      "comment": "\n     * \u003cp\u003ePrint the specified text to the specified PrintWriter.\u003c/p\u003e\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param nextLineTabStop The position on the next line for the first tab.\n     * @param text The text to be written to the PrintWriter\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 58)",
        "(line 623,col 9)-(line 623,col 60)",
        "(line 624,col 9)-(line 624,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.renderOptions(java.lang.StringBuffer, int, org.apache.commons.cli.Options, int, int)",
      "begin_line": 643,
      "end_line": 730,
      "comment": "\n     * \u003cp\u003eRender the specified Options and return the rendered Options\n     * in a StringBuffer.\u003c/p\u003e\n     *\n     * @param sb The StringBuffer to place the rendered Options into.\n     * @param width The number of characters to display per line\n     * @param options The command line Options\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     *\n     * @return the StringBuffer with the rendered Options contents.\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 51)",
        "(line 648,col 9)-(line 648,col 51)",
        "(line 654,col 9)-(line 654,col 20)",
        "(line 655,col 9)-(line 655,col 28)",
        "(line 656,col 9)-(line 656,col 42)",
        "(line 657,col 9)-(line 657,col 22)",
        "(line 658,col 9)-(line 658,col 45)",
        "(line 660,col 9)-(line 660,col 58)",
        "(line 662,col 9)-(line 698,col 9)",
        "(line 700,col 9)-(line 700,col 18)",
        "(line 702,col 9)-(line 727,col 9)",
        "(line 729,col 9)-(line 729,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.renderWrappedText(java.lang.StringBuffer, int, int, java.lang.String)",
      "begin_line": 743,
      "end_line": 774,
      "comment": "\n     * \u003cp\u003eRender the specified text and return the rendered Options\n     * in a StringBuffer.\u003c/p\u003e\n     *\n     * @param sb The StringBuffer to place the rendered text into.\n     * @param width The number of characters to display per line\n     * @param nextLineTabStop The position on the next line for the first tab.\n     * @param text The text to be rendered.\n     *\n     * @return the StringBuffer with the rendered Options contents.\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 46)",
        "(line 748,col 9)-(line 753,col 9)",
        "(line 754,col 9)-(line 754,col 72)",
        "(line 758,col 9)-(line 758,col 62)",
        "(line 760,col 9)-(line 773,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.findWrapPos(java.lang.String, int, int)",
      "begin_line": 789,
      "end_line": 833,
      "comment": "\n     * Finds the next text wrap position after \u003ccode\u003estartPos\u003c/code\u003e for the \n     * text in \u003ccode\u003etext\u003c/code\u003e with the column width \u003ccode\u003ewidth\u003c/code\u003e.\n     * The wrap point is the last postion before startPos+width having a \n     * whitespace character (space, \\n, \\r).\n     *\n     * @param text The text being searched for the wrap position\n     * @param width width of the wrapped text\n     * @param startPos position from which to start the lookup whitespace \n     * character\n     * @return postion on which the text must be wrapped or -1 if the wrap \n     * position is at the end of the text\n     ",
      "child_ranges": [
        "(line 791,col 9)-(line 791,col 21)",
        "(line 794,col 9)-(line 802,col 9)",
        "(line 806,col 9)-(line 806,col 31)",
        "(line 808,col 9)-(line 808,col 15)",
        "(line 810,col 9)-(line 814,col 9)",
        "(line 817,col 9)-(line 820,col 9)",
        "(line 824,col 9)-(line 824,col 31)",
        "(line 826,col 9)-(line 830,col 9)",
        "(line 832,col 9)-(line 832,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.createPadding(int)",
      "begin_line": 842,
      "end_line": 852,
      "comment": "\n     * \u003cp\u003eReturn a String of padding of length \u003ccode\u003elen\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param len The length of the String of padding to create.\n     *\n     * @return The String of padding\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 48)",
        "(line 846,col 9)-(line 849,col 9)",
        "(line 851,col 9)-(line 851,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.rtrim(java.lang.String)",
      "begin_line": 861,
      "end_line": 876,
      "comment": "\n     * \u003cp\u003eRemove the trailing whitespace from the specified String.\u003c/p\u003e\n     *\n     * @param s The String to remove the trailing padding from.\n     *\n     * @return The String of without the trailing padding\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 866,col 9)",
        "(line 868,col 9)-(line 868,col 29)",
        "(line 870,col 9)-(line 873,col 9)",
        "(line 875,col 9)-(line 875,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OptionComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 885,
      "end_line": 907,
      "comment": "\n     * \u003cp\u003eThis class implements the \u003ccode\u003eComparator\u003c/code\u003e interface\n     * for comparing Options.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.OptionComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 900,
      "end_line": 906,
      "comment": "\n         * \u003cp\u003eCompares its two arguments for order. Returns a negative \n         * integer, zero, or a positive integer as the first argument \n         * is less than, equal to, or greater than the second.\u003c/p\u003e\n         *\n         * @param o1 The first Option to be compared.\n         * @param o2 The second Option to be compared.\n         *\n         * @return a negative integer, zero, or a positive integer as \n         * the first argument is less than, equal to, or greater than the \n         * second.\n         ",
      "child_ranges": [
        "(line 902,col 13)-(line 902,col 37)",
        "(line 903,col 13)-(line 903,col 37)",
        "(line 905,col 13)-(line 905,col 68)"
      ]
    }
  ]
}