{
  "filepath": "/tmp/JxPath-18b/src/java/org/apache/commons/jxpath/ri/compiler/CoreFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoreFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.Operation"
      ],
      "begin_line": 43,
      "end_line": 922,
      "comment": "\n * An element of the compile tree representing one of built-in functions\n * like \"position()\" or \"number()\".\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionCode"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.CoreFunction(int, org.apache.commons.jxpath.ri.compiler.Expression[])",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Create a new CoreFunction.\n     * @param functionCode int function code\n     * @param args argument Expressions\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 20)",
        "(line 55,col 9)-(line 55,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getFunctionCode()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Get the function code.\n     * @return int function code\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getFunctionName()",
      "begin_line": 70,
      "end_line": 133,
      "comment": "\n     * Get the name of this function.\n     * @return String function name\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg1()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Convenience method to return the first argument.\n     * @return Expression\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg2()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * Convenience method to return the second argument.\n     * @return Expression\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg3()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Convenience method to return the third argument.\n     * @return Expression\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getArgumentCount()",
      "begin_line": 163,
      "end_line": 168,
      "comment": "\n     * Return the number of argument Expressions.\n     * @return int count\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.computeContextDependent()",
      "begin_line": 176,
      "end_line": 220,
      "comment": "\n     * Returns true if any argument is context dependent or if\n     * the function is last(), position(), boolean(), local-name(),\n     * name(), string(), lang(), number().\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.toString()",
      "begin_line": 225,
      "end_line": 240,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 49)",
        "(line 227,col 9)-(line 227,col 41)",
        "(line 228,col 9)-(line 228,col 27)",
        "(line 229,col 9)-(line 229,col 43)",
        "(line 230,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 27)",
        "(line 239,col 9)-(line 239,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.compute(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 252,
      "end_line": 317,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 316,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 324,
      "end_line": 340,
      "comment": "\n     * last() implementation.\n     * @param context evaluation context\n     * @return Number\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 26)",
        "(line 328,col 9)-(line 328,col 47)",
        "(line 329,col 9)-(line 329,col 24)",
        "(line 330,col 9)-(line 330,col 22)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionPosition(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 347,
      "end_line": 350,
      "comment": "\n     * position() implementation.\n     * @param context evaluation context\n     * @return Number\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 26)",
        "(line 349,col 9)-(line 349,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionCount(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 357,
      "end_line": 382,
      "comment": "\n     * count() implementation.\n     * @param context evaluation context\n     * @return Number\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 26)",
        "(line 359,col 9)-(line 359,col 36)",
        "(line 360,col 9)-(line 360,col 22)",
        "(line 361,col 9)-(line 361,col 45)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 389,
      "end_line": 397,
      "comment": "\n     * lang() implementation.\n     * @param context evaluation context\n     * @return Boolean\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 26)",
        "(line 391,col 9)-(line 391,col 79)",
        "(line 392,col 9)-(line 392,col 75)",
        "(line 393,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 404,
      "end_line": 410,
      "comment": "\n     * id() implementation.\n     * @param context evaluation context\n     * @return Pointer\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 26)",
        "(line 406,col 9)-(line 406,col 77)",
        "(line 407,col 9)-(line 407,col 65)",
        "(line 408,col 9)-(line 408,col 78)",
        "(line 409,col 9)-(line 409,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 417,
      "end_line": 443,
      "comment": "\n     * key() implementation.\n     * @param context evaluation context\n     * @return various Object\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 26)",
        "(line 419,col 9)-(line 419,col 78)",
        "(line 420,col 9)-(line 420,col 50)",
        "(line 421,col 9)-(line 421,col 30)",
        "(line 422,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 65)",
        "(line 432,col 9)-(line 432,col 68)",
        "(line 433,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNamespaceURI(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 450,
      "end_line": 467,
      "comment": "\n     * namespace-uri() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 456,col 26)",
        "(line 457,col 9)-(line 457,col 48)",
        "(line 458,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 474,
      "end_line": 489,
      "comment": "\n     * local-name() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 479,col 26)",
        "(line 480,col 9)-(line 480,col 48)",
        "(line 481,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionName(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 496,
      "end_line": 511,
      "comment": "\n     * name() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 501,col 26)",
        "(line 502,col 9)-(line 502,col 48)",
        "(line 503,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 510,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionString(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 518,
      "end_line": 524,
      "comment": "\n     * string() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 522,col 26)",
        "(line 523,col 9)-(line 523,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 531,
      "end_line": 541,
      "comment": "\n     * concat() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 535,col 49)",
        "(line 536,col 9)-(line 536,col 43)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 540,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionStartsWith(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 548,
      "end_line": 553,
      "comment": "\n     * starts-with() implementation.\n     * @param context evaluation context\n     * @return Boolean\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 26)",
        "(line 550,col 9)-(line 550,col 77)",
        "(line 551,col 9)-(line 551,col 77)",
        "(line 552,col 9)-(line 552,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 560,
      "end_line": 565,
      "comment": "\n     * contains() implementation.\n     * @param context evaluation context\n     * @return Boolean\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 26)",
        "(line 562,col 9)-(line 562,col 77)",
        "(line 563,col 9)-(line 563,col 77)",
        "(line 564,col 9)-(line 564,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstringBefore(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 572,
      "end_line": 581,
      "comment": "\n     * substring-before() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 26)",
        "(line 574,col 9)-(line 574,col 77)",
        "(line 575,col 9)-(line 575,col 77)",
        "(line 576,col 9)-(line 576,col 35)",
        "(line 577,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 580,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstringAfter(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 588,
      "end_line": 597,
      "comment": "\n     * substring-after() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 26)",
        "(line 590,col 9)-(line 590,col 77)",
        "(line 591,col 9)-(line 591,col 77)",
        "(line 592,col 9)-(line 592,col 35)",
        "(line 593,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 596,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 604,
      "end_line": 649,
      "comment": "\n     * substring() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 36)",
        "(line 606,col 9)-(line 608,col 9)",
        "(line 610,col 9)-(line 610,col 77)",
        "(line 611,col 9)-(line 611,col 79)",
        "(line 612,col 9)-(line 614,col 9)",
        "(line 616,col 9)-(line 616,col 32)",
        "(line 617,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 627,col 69)",
        "(line 628,col 9)-(line 628,col 36)",
        "(line 629,col 9)-(line 631,col 9)",
        "(line 633,col 9)-(line 633,col 34)",
        "(line 634,col 9)-(line 636,col 9)",
        "(line 638,col 9)-(line 643,col 9)",
        "(line 645,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 648,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionStringLength(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 656,
      "end_line": 666,
      "comment": "\n     * string-length() implementation.\n     * @param context evaluation context\n     * @return Number\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 17)",
        "(line 658,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 665,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNormalizeSpace(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 673,
      "end_line": 699,
      "comment": "\n     * normalize-space() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 26)",
        "(line 675,col 9)-(line 675,col 76)",
        "(line 676,col 9)-(line 676,col 39)",
        "(line 677,col 9)-(line 677,col 20)",
        "(line 678,col 9)-(line 678,col 22)",
        "(line 679,col 9)-(line 694,col 9)",
        "(line 695,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 698,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 706,
      "end_line": 726,
      "comment": "\n     * translate() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 26)",
        "(line 708,col 9)-(line 708,col 77)",
        "(line 709,col 9)-(line 709,col 77)",
        "(line 710,col 9)-(line 710,col 77)",
        "(line 711,col 9)-(line 711,col 40)",
        "(line 712,col 9)-(line 712,col 20)",
        "(line 713,col 9)-(line 724,col 9)",
        "(line 725,col 9)-(line 725,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 733,
      "end_line": 738,
      "comment": "\n     * boolean() implementation.\n     * @param context evaluation context\n     * @return Boolean\n     ",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 26)",
        "(line 735,col 9)-(line 737,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNot(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 745,
      "end_line": 750,
      "comment": "\n     * not() implementation.\n     * @param context evaluation context\n     * @return Boolean\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 26)",
        "(line 747,col 9)-(line 749,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTrue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 757,
      "end_line": 760,
      "comment": "\n     * true() implementation.\n     * @param context evaluation context\n     * @return Boolean.TRUE\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 26)",
        "(line 759,col 9)-(line 759,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFalse(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 767,
      "end_line": 770,
      "comment": "\n     * false() implementation.\n     * @param context evaluation context\n     * @return Boolean.FALSE\n     ",
      "child_ranges": [
        "(line 768,col 9)-(line 768,col 26)",
        "(line 769,col 9)-(line 769,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNull(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 777,
      "end_line": 780,
      "comment": "\n     * null() implementation.\n     * @param context evaluation context\n     * @return null\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 778,col 26)",
        "(line 779,col 9)-(line 779,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNumber(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 787,
      "end_line": 793,
      "comment": "\n     * number() implementation.\n     * @param context evaluation context\n     * @return Number\n     ",
      "child_ranges": [
        "(line 788,col 9)-(line 790,col 9)",
        "(line 791,col 9)-(line 791,col 26)",
        "(line 792,col 9)-(line 792,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSum(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 800,
      "end_line": 817,
      "comment": "\n     * sum() implementation.\n     * @param context evaluation context\n     * @return Number\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 26)",
        "(line 802,col 9)-(line 802,col 46)",
        "(line 803,col 9)-(line 805,col 9)",
        "(line 806,col 9)-(line 814,col 9)",
        "(line 815,col 9)-(line 816,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFloor(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 824,
      "end_line": 831,
      "comment": "\n     * floor() implementation.\n     * @param context evaluation context\n     * @return Number\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 825,col 26)",
        "(line 826,col 9)-(line 826,col 76)",
        "(line 827,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 830,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionCeiling(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 838,
      "end_line": 845,
      "comment": "\n     * ceiling() implementation.\n     * @param context evaluation context\n     * @return Number\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 26)",
        "(line 840,col 9)-(line 840,col 76)",
        "(line 841,col 9)-(line 843,col 9)",
        "(line 844,col 9)-(line 844,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionRound(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 852,
      "end_line": 859,
      "comment": "\n     * round() implementation.\n     * @param context evaluation context\n     * @return Number\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 26)",
        "(line 854,col 9)-(line 854,col 76)",
        "(line 855,col 9)-(line 857,col 9)",
        "(line 858,col 9)-(line 858,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFormatNumber(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 866,
      "end_line": 900,
      "comment": "\n     * format-number() implementation.\n     * @param context evaluation context\n     * @return String\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 36)",
        "(line 868,col 9)-(line 870,col 9)",
        "(line 872,col 9)-(line 873,col 69)",
        "(line 874,col 9)-(line 875,col 69)",
        "(line 877,col 9)-(line 877,col 44)",
        "(line 878,col 9)-(line 894,col 9)",
        "(line 896,col 9)-(line 896,col 74)",
        "(line 897,col 9)-(line 897,col 48)",
        "(line 898,col 9)-(line 898,col 46)",
        "(line 899,col 9)-(line 899,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.assertArgCount(int)",
      "begin_line": 906,
      "end_line": 908,
      "comment": "\n     * Assert \u003ccode\u003ecount\u003c/code\u003e args.\n     * @param count int\n     ",
      "child_ranges": [
        "(line 907,col 9)-(line 907,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.assertArgRange(int, int)",
      "begin_line": 915,
      "end_line": 921,
      "comment": "\n     * Assert at least \u003ccode\u003emin\u003c/code\u003e/at most \u003ccode\u003emax\u003c/code\u003e args.\n     * @param min int\n     * @param max int\n     ",
      "child_ranges": [
        "(line 916,col 9)-(line 916,col 36)",
        "(line 917,col 9)-(line 920,col 9)"
      ]
    }
  ]
}