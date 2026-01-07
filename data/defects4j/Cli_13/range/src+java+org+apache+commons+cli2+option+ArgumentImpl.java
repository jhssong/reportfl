{
  "filepath": "/tmp/Cli-13b/src/java/org/apache/commons/cli2/option/ArgumentImpl.java",
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
      "end_line": 375,
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
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 30)",
        "(line 146,col 9)-(line 188,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.canProcess(org.apache.commons.cli2.WriteableCommandLine, java.lang.String)",
      "begin_line": 191,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getPrefixes()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.process(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator)",
      "begin_line": 200,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getInitialSeparator()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getSubsequentSeparator()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getTriggers()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getConsumeRemaining()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getDefaultValues()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getValidator()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.validate(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 230,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.validate(org.apache.commons.cli2.WriteableCommandLine, org.apache.commons.cli2.Option)",
      "begin_line": 235,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 58)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 256,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.appendUsage(java.lang.StringBuffer, java.util.Set, java.util.Comparator)",
      "begin_line": 259,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 88)",
        "(line 266,col 9)-(line 267,col 93)",
        "(line 269,col 9)-(line 269,col 99)",
        "(line 272,col 9)-(line 272,col 69)",
        "(line 274,col 9)-(line 274,col 18)",
        "(line 277,col 9)-(line 304,col 9)",
        "(line 307,col 9)-(line 310,col 9)",
        "(line 313,col 9)-(line 320,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getDescription()",
      "begin_line": 323,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.helpLines(int, java.util.Set, java.util.Comparator)",
      "begin_line": 327,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 64)",
        "(line 332,col 9)-(line 332,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getMaximum()",
      "begin_line": 335,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.getMinimum()",
      "begin_line": 339,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.stripBoundaryQuotes(java.lang.String)",
      "begin_line": 352,
      "end_line": 360,
      "comment": "\n     * If there are any leading or trailing quotes remove them from the\n     * specified token.\n     *\n     * @param token\n     *            the token to strip leading and trailing quotes\n     *\n     * @return String the possibly modified token\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 355,col 9)",
        "(line 357,col 9)-(line 357,col 55)",
        "(line 359,col 9)-(line 359,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.isRequired()",
      "begin_line": 362,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.defaults(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 366,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 36)",
        "(line 368,col 9)-(line 368,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ArgumentImpl.defaultValues(org.apache.commons.cli2.WriteableCommandLine, org.apache.commons.cli2.Option)",
      "begin_line": 371,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 60)"
      ]
    }
  ]
}