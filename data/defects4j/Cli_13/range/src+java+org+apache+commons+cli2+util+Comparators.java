{
  "filepath": "/tmp/Cli-13b/src/java/org/apache/commons/cli2/util/Comparators.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Comparators",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 456,
      "comment": "\n * A collection of Comparators suitable for use with Option instances.\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.util.Comparators.Comparators()",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.chain(java.util.Comparator, java.util.Comparator)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Chains comparators together.\n     *\n     * @see #chain(Comparator[])\n     * @param c0\n     *            a comparator\n     * @param c1\n     *            a comparator\n     * @return a chained comparator\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.chain(java.util.Comparator, java.util.Comparator, java.util.Comparator)",
      "begin_line": 64,
      "end_line": 69,
      "comment": "\n     * Chains comparators together.\n     *\n     * @see #chain(Comparator[])\n     * @param c0\n     *            a comparator\n     * @param c1\n     *            a comparator\n     * @param c2\n     *            a comparator\n     * @return a chained comparator\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.chain(java.util.Comparator, java.util.Comparator, java.util.Comparator, java.util.Comparator)",
      "begin_line": 85,
      "end_line": 91,
      "comment": "\n     * Chains comparators together.\n     *\n     * @see #chain(Comparator[])\n     * @param c0\n     *            a comparator\n     * @param c1\n     *            a comparator\n     * @param c2\n     *            a comparator\n     * @param c3\n     *            a comparator\n     * @return a chained comparator\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.chain(java.util.Comparator, java.util.Comparator, java.util.Comparator, java.util.Comparator, java.util.Comparator)",
      "begin_line": 109,
      "end_line": 116,
      "comment": "\n     * Chains comparators together.\n     *\n     * @see #chain(Comparator[])\n     * @param c0\n     *            a comparator\n     * @param c1\n     *            a comparator\n     * @param c2\n     *            a comparator\n     * @param c3\n     *            a comparator\n     * @param c4\n     *            a comparator\n     * @return a chained comparator\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.chain(java.util.List)",
      "begin_line": 126,
      "end_line": 130,
      "comment": "\n     * Chains comparators together.\n     *\n     * @see #chain(Comparator[])\n     * @param comparators\n     *            a List of comparators to chain together\n     * @return a chained comparator\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.chain(java.util.Comparator[])",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Chains an array of comparators together. Each Comparator will be called\n     * in turn until one of them return a non-zero value, this value will be\n     * returned.\n     *\n     * @param comparators\n     *            the array of comparators\n     * @return a chained comparator\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Chain",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 148,
      "end_line": 168,
      "comment": "\n     * Chains a series of Comparators together.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "chain"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.util.Comparators.Chain.Chain(java.util.Comparator[])",
      "begin_line": 156,
      "end_line": 159,
      "comment": "\n         * Creates a Comparator chain using the specified array of Comparators\n         * @param chain the Comparators in the chain\n         ",
      "child_ranges": [
        "(line 157,col 13)-(line 157,col 54)",
        "(line 158,col 13)-(line 158,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.Chain.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 161,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 162,col 13)-(line 162,col 27)",
        "(line 163,col 13)-(line 165,col 13)",
        "(line 166,col 13)-(line 166,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.reverse(java.util.Comparator)",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Reverses a comparator\u0027s logic.\n     *\n     * @param wrapped\n     *            the Comparator to reverse the logic of\n     * @return a comparator with reverse logic\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Reverse",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 181,
      "end_line": 195,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wrapped"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.util.Comparators.Reverse.Reverse(java.util.Comparator)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n         * Creates a Comparator with reverse logic\n         * @param wrapped the original logic\n         ",
      "child_ranges": [
        "(line 189,col 13)-(line 189,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.Reverse.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 13)-(line 193,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.groupFirst()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * Forces Group instances to appear at the beginning of lists\n     *\n     * @see Group\n     * @return a new comparator\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.groupLast()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * Forces Group instances to appear at the end of lists\n     *\n     * @see Group\n     * @return a new comparator\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GroupFirst",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 217,
      "end_line": 230,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.GroupFirst.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 218,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 219,col 13)-(line 219,col 52)",
        "(line 220,col 13)-(line 220,col 53)",
        "(line 222,col 13)-(line 227,col 13)",
        "(line 228,col 13)-(line 228,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.switchFirst()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * Forces Switch instances to appear at the beginning of lists\n     *\n     * @see Switch\n     * @return a new comparator\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.switchLast()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Forces Switch instances to appear at the end of lists\n     *\n     * @see Switch\n     * @return a new comparator\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SwitchFirst",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 252,
      "end_line": 265,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.SwitchFirst.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 253,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 254,col 13)-(line 254,col 53)",
        "(line 255,col 13)-(line 255,col 54)",
        "(line 257,col 13)-(line 262,col 13)",
        "(line 263,col 13)-(line 263,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.commandFirst()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Forces Command instances to appear at the beginning of lists\n     *\n     * @see Command\n     * @return a new comparator\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.commandLast()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * Forces Command instances to appear at the end of lists\n     *\n     * @see Command\n     * @return a new comparator\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CommandFirst",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 287,
      "end_line": 300,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.CommandFirst.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 288,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 289,col 13)-(line 289,col 54)",
        "(line 290,col 13)-(line 290,col 55)",
        "(line 292,col 13)-(line 297,col 13)",
        "(line 298,col 13)-(line 298,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.defaultOptionFirst()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Forces DefaultOption instances to appear at the beginning of lists\n     *\n     * @see DefaultOption\n     * @return a new comparator\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.defaultOptionLast()",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\n     * Forces DefaultOption instances to appear at the end of lists\n     *\n     * @see DefaultOption\n     * @return a new comparator\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DefaultOptionFirst",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 322,
      "end_line": 335,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.DefaultOptionFirst.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 323,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 324,col 13)-(line 324,col 60)",
        "(line 325,col 13)-(line 325,col 61)",
        "(line 327,col 13)-(line 332,col 13)",
        "(line 333,col 13)-(line 333,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.namedFirst(java.lang.String)",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\n     * Forces Comparators with a particular trigger to appear at the beginning\n     * of lists\n     *\n     * @param name\n     *            the trigger name to select\n     * @see Option#getTriggers()\n     * @return a new comparator\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.namedLast(java.lang.String)",
      "begin_line": 359,
      "end_line": 361,
      "comment": "\n     * Forces Comparators with a particular trigger to appear at the end of\n     * lists\n     *\n     * @param name\n     *            the trigger name to select\n     * @see Option#getTriggers()\n     * @return a new comparator\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Named",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 363,
      "end_line": 388,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.util.Comparators.Named.Named(java.lang.String)",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\n         * Creates a Comparator that sorts a particular name high in order\n         * @param name the trigger name to select\n         ",
      "child_ranges": [
        "(line 371,col 13)-(line 371,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.Named.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 373,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 374,col 13)-(line 374,col 46)",
        "(line 375,col 13)-(line 375,col 48)",
        "(line 377,col 13)-(line 377,col 64)",
        "(line 378,col 13)-(line 378,col 65)",
        "(line 380,col 13)-(line 385,col 13)",
        "(line 386,col 13)-(line 386,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.preferredNameFirst()",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\n     * Orders Options by preferredName\n     *\n     * @see Option#getPreferredName()\n     * @return a new comparator\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.preferredNameLast()",
      "begin_line": 406,
      "end_line": 408,
      "comment": "\n     * Orders Options by preferredName, reversed\n     *\n     * @see Option#getPreferredName()\n     * @return a new comparator\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PreferredName",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 410,
      "end_line": 417,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.PreferredName.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 411,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 412,col 13)-(line 412,col 46)",
        "(line 413,col 13)-(line 413,col 48)",
        "(line 415,col 13)-(line 415,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.requiredFirst()",
      "begin_line": 425,
      "end_line": 427,
      "comment": "\n     * Orders Options grouping required Options first\n     *\n     * @see Option#isRequired()\n     * @return a new comparator\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.requiredLast()",
      "begin_line": 435,
      "end_line": 437,
      "comment": "\n     * Orders Options grouping required Options last\n     *\n     * @see Option#isRequired()\n     * @return a new comparator\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Required",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 439,
      "end_line": 455,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.util.Comparators.Required.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 440,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 441,col 13)-(line 441,col 46)",
        "(line 442,col 13)-(line 442,col 48)",
        "(line 444,col 13)-(line 444,col 48)",
        "(line 445,col 13)-(line 445,col 49)",
        "(line 447,col 13)-(line 452,col 13)",
        "(line 453,col 13)-(line 453,col 21)"
      ]
    }
  ]
}