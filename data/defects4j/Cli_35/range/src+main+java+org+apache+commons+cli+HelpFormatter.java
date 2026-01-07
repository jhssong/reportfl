{
  "filepath": "/tmp/Cli-35b/src/main/java/org/apache/commons/cli/HelpFormatter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HelpFormatter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 73,
      "end_line": 1094,
      "comment": "\n * A formatter of help messages for command line options.\n *\n * \u003cp\u003eExample:\u003c/p\u003e\n * \n * \u003cpre\u003e\n * Options options \u003d new Options();\n * options.addOption(OptionBuilder.withLongOpt(\"file\")\n *                                .withDescription(\"The file to be processed\")\n *                                .hasArg()\n *                                .withArgName(\"FILE\")\n *                                .isRequired()\n *                                .create(\u0027f\u0027));\n * options.addOption(OptionBuilder.withLongOpt(\"version\")\n *                                .withDescription(\"Print the version of the application\")\n *                                .create(\u0027v\u0027));\n * options.addOption(OptionBuilder.withLongOpt(\"help\").create(\u0027h\u0027));\n * \n * String header \u003d \"Do something useful with an input file\\n\\n\";\n * String footer \u003d \"\\nPlease report issues at http://example.com/issues\";\n * \n * HelpFormatter formatter \u003d new HelpFormatter();\n * formatter.printHelp(\"myapp\", header, options, footer, true);\n * \u003c/pre\u003e\n * \n * This produces the following output:\n * \n * \u003cpre\u003e\n * usage: myapp -f \u0026lt;FILE\u0026gt; [-h] [-v]\n * Do something useful with an input file\n * \n *  -f,--file \u0026lt;FILE\u0026gt;   The file to be processed\n *  -h,--help\n *  -v,--version       Print the version of the application\n * \n * Please report issues at http://example.com/issues\n * \u003c/pre\u003e\n * \n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_WIDTH"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " default number of characters per line "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LEFT_PAD"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " default padding to the left of each line "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DESC_PAD"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " number of space characters to be prefixed to each description line "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SYNTAX_PREFIX"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " the string to display at the beginning of the usage statement "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OPT_PREFIX"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " default prefix for shortOpts "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LONG_OPT_PREFIX"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " default prefix for long Option "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LONG_OPT_SEPARATOR"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " \n     * default separator displayed between a long Option and its value\n     * \n     * @since 1.3\n     *"
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ARG_NAME"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " default name for an argument "
    },
    {
      "type": "field",
      "varNames": [
        "defaultWidth"
      ],
      "begin_line": 113,
      "end_line": 114,
      "comment": "\n     * number of characters per line\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setWidth methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultLeftPad"
      ],
      "begin_line": 122,
      "end_line": 123,
      "comment": "\n     * amount of padding to the left of each line\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setLeftPadding methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultDescPad"
      ],
      "begin_line": 132,
      "end_line": 133,
      "comment": "\n     * the number of characters of padding to be prefixed\n     * to each description line\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setDescPadding methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultSyntaxPrefix"
      ],
      "begin_line": 141,
      "end_line": 142,
      "comment": "\n     * the string to display at the beginning of the usage statement\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setSyntaxPrefix methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultNewLine"
      ],
      "begin_line": 150,
      "end_line": 151,
      "comment": "\n     * the new line string\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setNewLine methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultOptPrefix"
      ],
      "begin_line": 159,
      "end_line": 160,
      "comment": "\n     * the shortOpt prefix\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setOptPrefix methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultLongOptPrefix"
      ],
      "begin_line": 168,
      "end_line": 169,
      "comment": "\n     * the long Opt prefix\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setLongOptPrefix methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultArgName"
      ],
      "begin_line": 177,
      "end_line": 178,
      "comment": "\n     * the name of the argument\n     *\n     * @deprecated Scope will be made private for next major version\n     * - use get/setArgName methods instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "optionComparator"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": "\n     * Comparator used to sort the options when they output in help text\n     * \n     * Defaults to case-insensitive alphabetical sorting by option key\n     "
    },
    {
      "type": "field",
      "varNames": [
        "longOptSeparator"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " The separator displayed between the long option and its value. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setWidth(int)",
      "begin_line": 195,
      "end_line": 198,
      "comment": "\n     * Sets the \u0027width\u0027.\n     *\n     * @param width the new value of \u0027width\u0027\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getWidth()",
      "begin_line": 205,
      "end_line": 208,
      "comment": "\n     * Returns the \u0027width\u0027.\n     *\n     * @return the \u0027width\u0027\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLeftPadding(int)",
      "begin_line": 215,
      "end_line": 218,
      "comment": "\n     * Sets the \u0027leftPadding\u0027.\n     *\n     * @param padding the new value of \u0027leftPadding\u0027\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLeftPadding()",
      "begin_line": 225,
      "end_line": 228,
      "comment": "\n     * Returns the \u0027leftPadding\u0027.\n     *\n     * @return the \u0027leftPadding\u0027\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setDescPadding(int)",
      "begin_line": 235,
      "end_line": 238,
      "comment": "\n     * Sets the \u0027descPadding\u0027.\n     *\n     * @param padding the new value of \u0027descPadding\u0027\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getDescPadding()",
      "begin_line": 245,
      "end_line": 248,
      "comment": "\n     * Returns the \u0027descPadding\u0027.\n     *\n     * @return the \u0027descPadding\u0027\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setSyntaxPrefix(java.lang.String)",
      "begin_line": 255,
      "end_line": 258,
      "comment": "\n     * Sets the \u0027syntaxPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027syntaxPrefix\u0027\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getSyntaxPrefix()",
      "begin_line": 265,
      "end_line": 268,
      "comment": "\n     * Returns the \u0027syntaxPrefix\u0027.\n     *\n     * @return the \u0027syntaxPrefix\u0027\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setNewLine(java.lang.String)",
      "begin_line": 275,
      "end_line": 278,
      "comment": "\n     * Sets the \u0027newLine\u0027.\n     *\n     * @param newline the new value of \u0027newLine\u0027\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getNewLine()",
      "begin_line": 285,
      "end_line": 288,
      "comment": "\n     * Returns the \u0027newLine\u0027.\n     *\n     * @return the \u0027newLine\u0027\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setOptPrefix(java.lang.String)",
      "begin_line": 295,
      "end_line": 298,
      "comment": "\n     * Sets the \u0027optPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027optPrefix\u0027\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getOptPrefix()",
      "begin_line": 305,
      "end_line": 308,
      "comment": "\n     * Returns the \u0027optPrefix\u0027.\n     *\n     * @return the \u0027optPrefix\u0027\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLongOptPrefix(java.lang.String)",
      "begin_line": 315,
      "end_line": 318,
      "comment": "\n     * Sets the \u0027longOptPrefix\u0027.\n     *\n     * @param prefix the new value of \u0027longOptPrefix\u0027\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLongOptPrefix()",
      "begin_line": 325,
      "end_line": 328,
      "comment": "\n     * Returns the \u0027longOptPrefix\u0027.\n     *\n     * @return the \u0027longOptPrefix\u0027\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setLongOptSeparator(java.lang.String)",
      "begin_line": 338,
      "end_line": 341,
      "comment": "\n     * Set the separator displayed between a long option and its value.\n     * Ensure that the separator specified is supported by the parser used,\n     * typically \u0027 \u0027 or \u0027\u003d\u0027.\n     * \n     * @param longOptSeparator the separator, typically \u0027 \u0027 or \u0027\u003d\u0027.\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getLongOptSeparator()",
      "begin_line": 349,
      "end_line": 352,
      "comment": "\n     * Returns the separator displayed between a long option and its value.\n     * \n     * @return the separator\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setArgName(java.lang.String)",
      "begin_line": 359,
      "end_line": 362,
      "comment": "\n     * Sets the \u0027argName\u0027.\n     *\n     * @param name the new value of \u0027argName\u0027\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getArgName()",
      "begin_line": 369,
      "end_line": 372,
      "comment": "\n     * Returns the \u0027argName\u0027.\n     *\n     * @return the \u0027argName\u0027\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.getOptionComparator()",
      "begin_line": 381,
      "end_line": 384,
      "comment": "\n     * Comparator used to sort the options when they output in help text.\n     * Defaults to case-insensitive alphabetical sorting by option key.\n     *\n     * @return the {@link Comparator} currently in use to sort the options\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.setOptionComparator(java.util.Comparator\u003corg.apache.commons.cli.Option\u003e)",
      "begin_line": 393,
      "end_line": 396,
      "comment": "\n     * Set the comparator used to sort the options when they output in help text.\n     * Passing in a null comparator will keep the options in the order they were declared.\n     *\n     * @param comparator the {@link Comparator} to use for sorting the options\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, org.apache.commons.cli.Options)",
      "begin_line": 406,
      "end_line": 409,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param options the Options instance\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, org.apache.commons.cli.Options, boolean)",
      "begin_line": 421,
      "end_line": 424,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to \n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param options the Options instance\n     * @param autoUsage whether to print an automatically generated\n     * usage statement\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String)",
      "begin_line": 436,
      "end_line": 439,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the beginning of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String, boolean)",
      "begin_line": 453,
      "end_line": 456,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to \n     * System.out.\n     *\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the beginning of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated\n     * usage statement\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String)",
      "begin_line": 469,
      "end_line": 472,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the beginning of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, java.lang.String, boolean)",
      "begin_line": 487,
      "end_line": 494,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.  This method prints help information to\n     * System.out.\n     *\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the beginning of the help\n     * @param options the Options instance\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated \n     * usage statement\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 53)",
        "(line 492,col 9)-(line 492,col 116)",
        "(line 493,col 9)-(line 493,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String)",
      "begin_line": 513,
      "end_line": 518,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.\n     *\n     * @param pw the writer to which the help will be written\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the beginning of the help\n     * @param options the Options instance\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     * @param footer the banner to display at the end of the help\n     *\n     * @throws IllegalStateException if there is no room to print a line\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printHelp(java.io.PrintWriter, int, java.lang.String, java.lang.String, org.apache.commons.cli.Options, int, int, java.lang.String, boolean)",
      "begin_line": 540,
      "end_line": 569,
      "comment": "\n     * Print the help for \u003ccode\u003eoptions\u003c/code\u003e with the specified\n     * command line syntax.\n     *\n     * @param pw the writer to which the help will be written\n     * @param width the number of characters to be displayed on each line\n     * @param cmdLineSyntax the syntax for this application\n     * @param header the banner to display at the beginning of the help\n     * @param options the Options instance\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     * @param footer the banner to display at the end of the help\n     * @param autoUsage whether to print an automatically generated\n     * usage statement\n     *\n     * @throws IllegalStateException if there is no room to print a line\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 547,col 9)",
        "(line 549,col 9)-(line 556,col 9)",
        "(line 558,col 9)-(line 561,col 9)",
        "(line 563,col 9)-(line 563,col 59)",
        "(line 565,col 9)-(line 568,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printUsage(java.io.PrintWriter, int, java.lang.String, org.apache.commons.cli.Options)",
      "begin_line": 579,
      "end_line": 634,
      "comment": "\n     * Prints the usage statement for the specified application.\n     *\n     * @param pw The PrintWriter to print the usage statement \n     * @param width The number of characters to display per line\n     * @param app The application name\n     * @param options The command line Options\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 88)",
        "(line 585,col 9)-(line 585,col 79)",
        "(line 587,col 9)-(line 587,col 75)",
        "(line 588,col 9)-(line 591,col 9)",
        "(line 593,col 9)-(line 629,col 9)",
        "(line 633,col 9)-(line 633,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.appendOptionGroup(java.lang.StringBuffer, org.apache.commons.cli.OptionGroup)",
      "begin_line": 644,
      "end_line": 672,
      "comment": "\n     * Appends the usage clause for an OptionGroup to a StringBuffer.  \n     * The clause is wrapped in square brackets if the group is required.\n     * The display of the options is handled by appendOption\n     * @param buff the StringBuffer to append to\n     * @param group the group to append\n     * @see #appendOption(StringBuffer,Option,boolean)\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 649,col 9)",
        "(line 651,col 9)-(line 651,col 73)",
        "(line 652,col 9)-(line 655,col 9)",
        "(line 657,col 9)-(line 666,col 9)",
        "(line 668,col 9)-(line 671,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.appendOption(java.lang.StringBuffer, org.apache.commons.cli.Option, boolean)",
      "begin_line": 681,
      "end_line": 709,
      "comment": "\n     * Appends the usage clause for an Option to a StringBuffer.  \n     *\n     * @param buff the StringBuffer to append to\n     * @param option the Option to append\n     * @param required whether the Option is required or not\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 686,col 9)",
        "(line 688,col 9)-(line 695,col 9)",
        "(line 698,col 9)-(line 702,col 9)",
        "(line 705,col 9)-(line 708,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printUsage(java.io.PrintWriter, int, java.lang.String)",
      "begin_line": 719,
      "end_line": 724,
      "comment": "\n     * Print the cmdLineSyntax to the specified writer, using the\n     * specified width.\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters per line for the usage statement.\n     * @param cmdLineSyntax The usage statement.\n     ",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 52)",
        "(line 723,col 9)-(line 723,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printOptions(java.io.PrintWriter, int, org.apache.commons.cli.Options, int, int)",
      "begin_line": 738,
      "end_line": 745,
      "comment": "\n     * Print the help for the specified Options to the specified writer, \n     * using the specified width, left padding and description padding.\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param options The command line Options\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     ",
      "child_ranges": [
        "(line 741,col 9)-(line 741,col 45)",
        "(line 743,col 9)-(line 743,col 60)",
        "(line 744,col 9)-(line 744,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printWrapped(java.io.PrintWriter, int, java.lang.String)",
      "begin_line": 754,
      "end_line": 757,
      "comment": "\n     * Print the specified text to the specified PrintWriter.\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param text The text to be written to the PrintWriter\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.printWrapped(java.io.PrintWriter, int, int, java.lang.String)",
      "begin_line": 767,
      "end_line": 773,
      "comment": "\n     * Print the specified text to the specified PrintWriter.\n     *\n     * @param pw The printWriter to write the help to\n     * @param width The number of characters to display per line\n     * @param nextLineTabStop The position on the next line for the first tab.\n     * @param text The text to be written to the PrintWriter\n     ",
      "child_ranges": [
        "(line 769,col 9)-(line 769,col 58)",
        "(line 771,col 9)-(line 771,col 65)",
        "(line 772,col 9)-(line 772,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.renderOptions(java.lang.StringBuffer, int, org.apache.commons.cli.Options, int, int)",
      "begin_line": 791,
      "end_line": 877,
      "comment": "\n     * Render the specified Options and return the rendered Options\n     * in a StringBuffer.\n     *\n     * @param sb The StringBuffer to place the rendered Options into.\n     * @param width The number of characters to display per line\n     * @param options The command line Options\n     * @param leftPad the number of characters of padding to be prefixed\n     * to each line\n     * @param descPad the number of characters of padding to be prefixed\n     * to each description line\n     *\n     * @return the StringBuffer with the rendered Options contents.\n     ",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 51)",
        "(line 794,col 9)-(line 794,col 51)",
        "(line 800,col 9)-(line 800,col 20)",
        "(line 801,col 9)-(line 801,col 70)",
        "(line 803,col 9)-(line 803,col 53)",
        "(line 805,col 9)-(line 808,col 9)",
        "(line 810,col 9)-(line 845,col 9)",
        "(line 847,col 9)-(line 847,col 18)",
        "(line 849,col 9)-(line 874,col 9)",
        "(line 876,col 9)-(line 876,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.renderWrappedText(java.lang.StringBuffer, int, int, java.lang.String)",
      "begin_line": 890,
      "end_line": 931,
      "comment": "\n     * Render the specified text and return the rendered Options\n     * in a StringBuffer.\n     *\n     * @param sb The StringBuffer to place the rendered text into.\n     * @param width The number of characters to display per line\n     * @param nextLineTabStop The position on the next line for the first tab.\n     * @param text The text to be rendered.\n     *\n     * @return the StringBuffer with the rendered Options contents.\n     ",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 46)",
        "(line 895,col 9)-(line 900,col 9)",
        "(line 901,col 9)-(line 901,col 70)",
        "(line 903,col 9)-(line 907,col 9)",
        "(line 910,col 9)-(line 910,col 62)",
        "(line 912,col 9)-(line 930,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.renderWrappedTextBlock(java.lang.StringBuffer, int, int, java.lang.String)",
      "begin_line": 942,
      "end_line": 968,
      "comment": "\n     * Render the specified text width a maximum width. This method differs\n     * from renderWrappedText by not removing leading spaces after a new line.\n     *\n     * @param sb The StringBuffer to place the rendered text into.\n     * @param width The number of characters to display per line\n     * @param nextLineTabStop The position on the next line for the first tab.\n     * @param text The text to be rendered.\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 965,col 9)",
        "(line 967,col 9)-(line 967,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.findWrapPos(java.lang.String, int, int)",
      "begin_line": 984,
      "end_line": 1024,
      "comment": "\n     * Finds the next text wrap position after \u003ccode\u003estartPos\u003c/code\u003e for the\n     * text in \u003ccode\u003etext\u003c/code\u003e with the column width \u003ccode\u003ewidth\u003c/code\u003e.\n     * The wrap point is the last position before startPos+width having a \n     * whitespace character (space, \\n, \\r). If there is no whitespace character\n     * before startPos+width, it will return startPos+width.\n     *\n     * @param text The text being searched for the wrap position\n     * @param width width of the wrapped text\n     * @param startPos position from which to start the lookup whitespace\n     * character\n     * @return position on which the text must be wrapped or -1 if the wrap\n     * position is at the end of the text\n     ",
      "child_ranges": [
        "(line 987,col 9)-(line 987,col 47)",
        "(line 988,col 9)-(line 991,col 9)",
        "(line 993,col 9)-(line 993,col 43)",
        "(line 994,col 9)-(line 997,col 9)",
        "(line 999,col 9)-(line 1002,col 9)",
        "(line 1005,col 9)-(line 1012,col 9)",
        "(line 1015,col 9)-(line 1018,col 9)",
        "(line 1021,col 9)-(line 1021,col 31)",
        "(line 1023,col 9)-(line 1023,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.createPadding(int)",
      "begin_line": 1033,
      "end_line": 1039,
      "comment": "\n     * Return a String of padding of length \u003ccode\u003elen\u003c/code\u003e.\n     *\n     * @param len The length of the String of padding to create.\n     *\n     * @return The String of padding\n     ",
      "child_ranges": [
        "(line 1035,col 9)-(line 1035,col 39)",
        "(line 1036,col 9)-(line 1036,col 34)",
        "(line 1038,col 9)-(line 1038,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.rtrim(java.lang.String)",
      "begin_line": 1048,
      "end_line": 1063,
      "comment": "\n     * Remove the trailing whitespace from the specified String.\n     *\n     * @param s The String to remove the trailing padding from.\n     *\n     * @return The String of without the trailing padding\n     ",
      "child_ranges": [
        "(line 1050,col 9)-(line 1053,col 9)",
        "(line 1055,col 9)-(line 1055,col 29)",
        "(line 1057,col 9)-(line 1060,col 9)",
        "(line 1062,col 9)-(line 1062,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OptionComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003corg.apache.commons.cli.Option\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 1072,
      "end_line": 1092,
      "comment": "\n     * This class implements the \u003ccode\u003eComparator\u003c/code\u003e interface\n     * for comparing Options.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1075,
      "end_line": 1075,
      "comment": " The serial version UID. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.HelpFormatter.OptionComparator.compare(org.apache.commons.cli.Option, org.apache.commons.cli.Option)",
      "begin_line": 1088,
      "end_line": 1091,
      "comment": "\n         * Compares its two arguments for order. Returns a negative\n         * integer, zero, or a positive integer as the first argument\n         * is less than, equal to, or greater than the second.\n         *\n         * @param opt1 The first Option to be compared.\n         * @param opt2 The second Option to be compared.\n         * @return a negative integer, zero, or a positive integer as\n         *         the first argument is less than, equal to, or greater than the\n         *         second.\n         ",
      "child_ranges": [
        "(line 1090,col 13)-(line 1090,col 68)"
      ]
    }
  ]
}