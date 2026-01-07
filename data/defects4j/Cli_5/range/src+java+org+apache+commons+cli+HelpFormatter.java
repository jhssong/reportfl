{
  "filepath": "/tmp/Cli-5b/src/java/org/apache/commons/cli/HelpFormatter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HelpFormatter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 909,
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
      "begin_line": 44,
      "end_line": 44,
      "comment": " ?? "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SYNTAX_PREFIX"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " the string to display at the begining of the usage statement "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OPT_PREFIX"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " default prefix for shortOpts "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LONG_OPT_PREFIX"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " default prefix for long Option "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ARG_NAME"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " default name for an argument "
    },
    {
      "type": "field",
      "varNames": [
        "defaultWidth"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " number of characters per line "
    },
    {
      "type": "field",
      "varNames": [
        "defaultLeftPad"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " amount of padding to the left of each line "
    },
    {
      "type": "field",
      "varNames": [
        "defaultDescPad"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " ?? "
    },
    {
      "type": "field",
      "varNames": [
        "defaultSyntaxPrefix"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " the string to display at the begining of the usage statement "
    },
    {
      "type": "field",
      "varNames": [
        "defaultNewLine"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " the new line character/string ?? "
    },
    {
      "type": "field",
      "varNames": [
        "defaultOptPrefix"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " the shortOpt prefix "
    },
    {
      "type": "field",
      "varNames": [
        "defaultLongOptPrefix"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " the long Opt prefix "
    },
    {
      "type": "field",
      "varNames": [
        "defaultArgName"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " the name of the argument "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setWidth(int)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * Sets the \u0027width\u0027.\n     *\n     * @param width the new value of \u0027width\u0027\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getWidth()",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * Returns the \u0027width\u0027.\n     *\n     * @return the \u0027width\u0027\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLeftPadding(int)",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * Sets the \u0027leftPadding\u0027.\n     *\n     * @param padding the new value of \u0027leftPadding\u0027\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLeftPadding()",
      "begin_line": 119,
      "end_line": 122,
      "comment": "\n     * Returns the \u0027leftPadding\u0027.\n     *\n     * @return the \u0027leftPadding\u0027\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setDescPadding(int)",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * Sets the \u0027descPadding\u0027.\n     *\n     * @param padding the new value of \u0027descPadding\u0027\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getDescPadding()",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\n     * Returns the \u0027descPadding\u0027.\n     *\n     * @return the \u0027descPadding\u0027\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setSyntaxPrefix(java.lang.String)",
      "begin_line": 149,
      "end_line": 152,
      "comment": "\n     * Sets the \u0027syntaxPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027syntaxPrefix\u0027\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getSyntaxPrefix()",
      "begin_line": 159,
      "end_line": 162,
      "comment": "\n     * Returns the \u0027syntaxPrefix\u0027.\n     *\n     * @return the \u0027syntaxPrefix\u0027\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setNewLine(java.lang.String)",
      "begin_line": 169,
      "end_line": 172,
      "comment": "\n     * Sets the \u0027newLine\u0027.\n     *\n     * @param newline the new value of \u0027newLine\u0027\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getNewLine()",
      "begin_line": 179,
      "end_line": 182,
      "comment": "\n     * Returns the \u0027newLine\u0027.\n     *\n     * @return the \u0027newLine\u0027\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setOptPrefix(java.lang.String)",
      "begin_line": 189,
      "end_line": 192,
      "comment": "\n     * Sets the \u0027optPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027optPrefix\u0027\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getOptPrefix()",
      "begin_line": 199,
      "end_line": 202,
      "comment": "\n     * Returns the \u0027optPrefix\u0027.\n     *\n     * @return the \u0027optPrefix\u0027\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLongOptPrefix(java.lang.String)",
      "begin_line": 209,
      "end_line": 212,
      "comment": "\n     * Sets the \u0027longOptPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027longOptPrefix\u0027\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLongOptPrefix()",
      "begin_line": 219,
      "end_line": 222,
      "comment": "\n     * Returns the \u0027longOptPrefix\u0027.\n     *\n     * @return the \u0027longOptPrefix\u0027\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setArgName(java.lang.String)",
      "begin_line": 229,
      "end_line": 232,
      "comment": "\n     * Sets the \u0027argName\u0027.\n     *\n     * @param name the new value of \u0027argName\u0027\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getArgName()",
      "begin_line": 239,
      "end_line": 242,
      "comment": "\n     * Returns the \u0027argName\u0027.\n     *\n     * @return the \u0027argName\u0027\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, org.apache.commons.cli.Options)",
      "begin_line": 255,
      "end_line": 258,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\u003c/p\u003e\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param options the Options instance\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, org.apache.commons.cli.Options, boolean)",
      "begin_line": 270,
      "end_line": 274,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to \n     * System.out.\u003c/p\u003e\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param options the Options instance\n     * @param autoUsage whether to print an automatically generated \n     * usage statement\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String)",
      "begin_line": 286,
      "end_line": 290,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\u003c/p\u003e\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String, boolean)",
      "begin_line": 304,
      "end_line": 309,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to \n     * System.out.\u003c/p\u003e\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated \n     * usage statement\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 308,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String)",
      "begin_line": 322,
      "end_line": 326,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\u003c/p\u003e\n     *\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String, boolean)",
      "begin_line": 341,
      "end_line": 349,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\u003c/p\u003e\n     *\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated \n     * usage statement\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 53)",
        "(line 346,col 9)-(line 347,col 53)",
        "(line 348,col 9)-(line 348,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String)",
      "begin_line": 366,
      "end_line": 372,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.\u003c/p\u003e\n     *\n     * @param pw the writer to which the help will be written\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     * @param footer the banner to display at the end of the help\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 371,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String, boolean)",
      "begin_line": 392,
      "end_line": 421,
      "comment": "\n     * \u003cp\u003ePrint the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.\u003c/p\u003e\n     *\n     * @param pw the writer to which the help will be written\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the begining of the help\n     * @param options the Options instance\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated \n     * usage statement\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 399,col 9)",
        "(line 401,col 9)-(line 408,col 9)",
        "(line 410,col 9)-(line 413,col 9)",
        "(line 415,col 9)-(line 415,col 59)",
        "(line 417,col 9)-(line 420,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printUsage(java.io.PrintWriter, int, java.lang.String, org.apache.commons.cli.Options)",
      "begin_line": 432,
      "end_line": 488,
      "comment": "\n     * \u003cp\u003ePrints the usage statement for the specified application.\u003c/p\u003e\n     *\n     * @param pw The PrintWriter to print the usage statement \n     * @param width The number of characters to display per line\n     * @param app The application name\n     * @param options The command line Options\n     *\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 437,col 78)",
        "(line 440,col 9)-(line 440,col 59)",
        "(line 443,col 9)-(line 443,col 22)",
        "(line 446,col 9)-(line 482,col 9)",
        "(line 486,col 9)-(line 487,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.appendOptionGroup(java.lang.StringBuffer, org.apache.commons.cli.OptionGroup)",
      "begin_line": 498,
      "end_line": 522,
      "comment": "\n     * Appends the usage clause for an OptionGroup to a StringBuffer.  \n     * The clause is wrapped in square brackets if the group is required.\n     * The display of the options is handled by appendOption\n     * @param buff the StringBuffer to append to\n     * @param group the group to append\n     * @see #appendOption(StringBuffer,Option,boolean)\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 504,col 9)",
        "(line 507,col 9)-(line 516,col 9)",
        "(line 518,col 9)-(line 521,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.appendOption(java.lang.StringBuffer, org.apache.commons.cli.Option, boolean)",
      "begin_line": 531,
      "end_line": 560,
      "comment": "\n     * Appends the usage clause for an Option to a StringBuffer.  \n     *\n     * @param buff the StringBuffer to append to\n     * @param option the Option to append\n     * @param required whether the Option is required or not\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 538,col 9)",
        "(line 540,col 9)-(line 547,col 9)",
        "(line 550,col 9)-(line 553,col 9)",
        "(line 556,col 9)-(line 559,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printUsage(java.io.PrintWriter, int, java.lang.String)",
      "begin_line": 570,
      "end_line": 576,
      "comment": "\n     * \u003cp\u003ePrint the cmdLineSyntax to the specified writer, using the\n     * specified width.\u003c/p\u003e\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters per line for the usage statement.\n     * @param cmdLineSyntax The usage statement.\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 52)",
        "(line 574,col 9)-(line 575,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printOptions(java.io.PrintWriter, int, org.apache.commons.cli.Options, int, int)",
      "begin_line": 590,
      "end_line": 597,
      "comment": "\n     * \u003cp\u003ePrint the help for the specified Options to the specified writer, \n     * using the specified width, left padding and description padding.\u003c/p\u003e\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param options The command line Options\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 45)",
        "(line 595,col 9)-(line 595,col 60)",
        "(line 596,col 9)-(line 596,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printWrapped(java.io.PrintWriter, int, java.lang.String)",
      "begin_line": 606,
      "end_line": 609,
      "comment": "\n     * \u003cp\u003ePrint the specified text to the specified PrintWriter.\u003c/p\u003e\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param text The text to be written to the PrintWriter\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printWrapped(java.io.PrintWriter, int, int, java.lang.String)",
      "begin_line": 619,
      "end_line": 626,
      "comment": "\n     * \u003cp\u003ePrint the specified text to the specified PrintWriter.\u003c/p\u003e\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param nextLineTabStop The position on the next line for the first tab.\n     * @param text The text to be written to the PrintWriter\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 58)",
        "(line 624,col 9)-(line 624,col 60)",
        "(line 625,col 9)-(line 625,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.renderOptions(java.lang.StringBuffer, int, org.apache.commons.cli.Options, int, int)",
      "begin_line": 644,
      "end_line": 731,
      "comment": "\n     * \u003cp\u003eRender the specified Options and return the rendered Options\n     * in a StringBuffer.\u003c/p\u003e\n     *\n     * @param sb The StringBuffer to place the rendered Options into.\n     * @param width The number of characters to display per line\n     * @param options The command line Options\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     *\n     * @return the StringBuffer with the rendered Options contents.\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 51)",
        "(line 649,col 9)-(line 649,col 51)",
        "(line 655,col 9)-(line 655,col 20)",
        "(line 656,col 9)-(line 656,col 28)",
        "(line 657,col 9)-(line 657,col 42)",
        "(line 658,col 9)-(line 658,col 22)",
        "(line 659,col 9)-(line 659,col 45)",
        "(line 661,col 9)-(line 661,col 58)",
        "(line 663,col 9)-(line 699,col 9)",
        "(line 701,col 9)-(line 701,col 18)",
        "(line 703,col 9)-(line 728,col 9)",
        "(line 730,col 9)-(line 730,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.renderWrappedText(java.lang.StringBuffer, int, int, java.lang.String)",
      "begin_line": 744,
      "end_line": 775,
      "comment": "\n     * \u003cp\u003eRender the specified text and return the rendered Options\n     * in a StringBuffer.\u003c/p\u003e\n     *\n     * @param sb The StringBuffer to place the rendered text into.\n     * @param width The number of characters to display per line\n     * @param nextLineTabStop The position on the next line for the first tab.\n     * @param text The text to be rendered.\n     *\n     * @return the StringBuffer with the rendered Options contents.\n     ",
      "child_ranges": [
        "(line 747,col 9)-(line 747,col 46)",
        "(line 749,col 9)-(line 754,col 9)",
        "(line 755,col 9)-(line 755,col 72)",
        "(line 759,col 9)-(line 759,col 62)",
        "(line 761,col 9)-(line 774,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.findWrapPos(java.lang.String, int, int)",
      "begin_line": 790,
      "end_line": 834,
      "comment": "\n     * Finds the next text wrap position after \u003ccode\u003estartPos\u003c/code\u003e for the \n     * text in \u003ccode\u003etext\u003c/code\u003e with the column width \u003ccode\u003ewidth\u003c/code\u003e.\n     * The wrap point is the last postion before startPos+width having a \n     * whitespace character (space, \\n, \\r).\n     *\n     * @param text The text being searched for the wrap position\n     * @param width width of the wrapped text\n     * @param startPos position from which to start the lookup whitespace \n     * character\n     * @return postion on which the text must be wrapped or -1 if the wrap \n     * position is at the end of the text\n     ",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 21)",
        "(line 795,col 9)-(line 803,col 9)",
        "(line 807,col 9)-(line 807,col 31)",
        "(line 809,col 9)-(line 809,col 15)",
        "(line 811,col 9)-(line 815,col 9)",
        "(line 818,col 9)-(line 821,col 9)",
        "(line 825,col 9)-(line 825,col 31)",
        "(line 827,col 9)-(line 831,col 9)",
        "(line 833,col 9)-(line 833,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.createPadding(int)",
      "begin_line": 843,
      "end_line": 853,
      "comment": "\n     * \u003cp\u003eReturn a String of padding of length \u003ccode\u003elen\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param len The length of the String of padding to create.\n     *\n     * @return The String of padding\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 48)",
        "(line 847,col 9)-(line 850,col 9)",
        "(line 852,col 9)-(line 852,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.rtrim(java.lang.String)",
      "begin_line": 862,
      "end_line": 877,
      "comment": "\n     * \u003cp\u003eRemove the trailing whitespace from the specified String.\u003c/p\u003e\n     *\n     * @param s The String to remove the trailing padding from.\n     *\n     * @return The String of without the trailing padding\n     ",
      "child_ranges": [
        "(line 864,col 9)-(line 867,col 9)",
        "(line 869,col 9)-(line 869,col 29)",
        "(line 871,col 9)-(line 874,col 9)",
        "(line 876,col 9)-(line 876,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OptionComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 886,
      "end_line": 908,
      "comment": "\n     * \u003cp\u003eThis class implements the \u003ccode\u003eComparator\u003c/code\u003e interface\n     * for comparing Options.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.OptionComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 901,
      "end_line": 907,
      "comment": "\n         * \u003cp\u003eCompares its two arguments for order. Returns a negative \n         * integer, zero, or a positive integer as the first argument \n         * is less than, equal to, or greater than the second.\u003c/p\u003e\n         *\n         * @param o1 The first Option to be compared.\n         * @param o2 The second Option to be compared.\n         *\n         * @return a negative integer, zero, or a positive integer as \n         * the first argument is less than, equal to, or greater than the \n         * second.\n         ",
      "child_ranges": [
        "(line 903,col 13)-(line 903,col 37)",
        "(line 904,col 13)-(line 904,col 37)",
        "(line 906,col 13)-(line 906,col 68)"
      ]
    }
  ]
}