{
  "filepath": "/tmp/Cli-7b/src/java/org/apache/commons/cli2/option/ArgumentImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArgumentImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.option.OptionImpl",
        "org.apache.commons.cli2.Argument"
      ],
      "begin_line": 40,
      "end_line": 374,
      "comment": "\n * An implementation of an Argument.\n "
    },
    {
      "type": "field",
      "varNames": [
        "NUL"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INITIAL_SEPARATOR"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * The default value for the initial separator char.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SUBSEQUENT_SEPARATOR"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * The default value for the subsequent separator char.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CONSUME_REMAINING"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * The default token to indicate that remaining arguments should be consumed\n     * as values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minimum"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maximum"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "initialSeparator"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subsequentSeparator"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subsequentSplit"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "validator"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "consumeRemaining"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultValues"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "resources"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.ArgumentImpl(java.lang.String, java.lang.String, int, int, char, char, org.apache.commons.cli2.validation.Validator, java.lang.String, java.util.List, int)",
      "begin_line": 97,
      "end_line": 133,
      "comment": "\n     * Creates a new Argument instance.\n     *\n     * @param name\n     *            The name of the argument\n     * @param description\n     *            A description of the argument\n     * @param minimum\n     *            The minimum number of values needed to be valid\n     * @param maximum\n     *            The maximum number of values allowed to be valid\n     * @param initialSeparator\n     *            The char separating option from value\n     * @param subsequentSeparator\n     *            The char separating values from each other\n     * @param validator\n     *            The object responsible for validating the values\n     * @param consumeRemaining\n     *            The String used for the \"consuming option\" group\n     * @param valueDefaults\n     *            The values to be used if none are specified.\n     * @param id\n     *            The id of the option, 0 implies automatic assignment.\n     *\n     * @see OptionImpl#OptionImpl(int,boolean)\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 25)",
        "(line 109,col 9)-(line 109,col 50)",
        "(line 110,col 9)-(line 110,col 39)",
        "(line 111,col 9)-(line 111,col 31)",
        "(line 112,col 9)-(line 112,col 31)",
        "(line 113,col 9)-(line 113,col 49)",
        "(line 114,col 9)-(line 114,col 55)",
        "(line 115,col 9)-(line 115,col 58)",
        "(line 116,col 9)-(line 116,col 35)",
        "(line 117,col 9)-(line 117,col 49)",
        "(line 118,col 9)-(line 118,col 43)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getPreferredName()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.processValues(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator, org.apache.commons.cli2.Option)",
      "begin_line": 139,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 89)",
        "(line 145,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.canProcess(org.apache.commons.cli2.WriteableCommandLine, java.lang.String)",
      "begin_line": 190,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getPrefixes()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.process(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator)",
      "begin_line": 199,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getInitialSeparator()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getSubsequentSeparator()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getTriggers()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getConsumeRemaining()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 218,col 6)-(line 218,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getDefaultValues()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 222,col 6)-(line 222,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getValidator()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 6)-(line 226,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.validate(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 229,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.validate(org.apache.commons.cli2.WriteableCommandLine, org.apache.commons.cli2.Option)",
      "begin_line": 234,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 58)",
        "(line 239,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 255,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.appendUsage(java.lang.StringBuffer, java.util.Set, java.util.Comparator)",
      "begin_line": 258,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 88)",
        "(line 265,col 9)-(line 266,col 93)",
        "(line 268,col 9)-(line 268,col 99)",
        "(line 271,col 9)-(line 271,col 69)",
        "(line 273,col 9)-(line 273,col 18)",
        "(line 276,col 9)-(line 303,col 9)",
        "(line 306,col 9)-(line 309,col 9)",
        "(line 312,col 9)-(line 319,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getDescription()",
      "begin_line": 322,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.helpLines(int, java.util.Set, java.util.Comparator)",
      "begin_line": 326,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 64)",
        "(line 331,col 9)-(line 331,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getMaximum()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getMinimum()",
      "begin_line": 338,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.stripBoundaryQuotes(java.lang.String)",
      "begin_line": 351,
      "end_line": 359,
      "comment": "\n     * If there are any leading or trailing quotes remove them from the\n     * specified token.\n     *\n     * @param token\n     *            the token to strip leading and trailing quotes\n     *\n     * @return String the possibly modified token\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 356,col 55)",
        "(line 358,col 9)-(line 358,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.isRequired()",
      "begin_line": 361,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.defaults(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 365,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 36)",
        "(line 367,col 9)-(line 367,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.defaultValues(org.apache.commons.cli2.WriteableCommandLine, org.apache.commons.cli2.Option)",
      "begin_line": 370,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 60)"
      ]
    }
  ]
}