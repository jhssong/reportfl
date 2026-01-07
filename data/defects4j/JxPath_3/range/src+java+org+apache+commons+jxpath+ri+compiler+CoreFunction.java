{
  "filepath": "/tmp/JxPath-3b/src/java/org/apache/commons/jxpath/ri/compiler/CoreFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoreFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.Operation"
      ],
      "begin_line": 40,
      "end_line": 694,
      "comment": "\n * An element of the compile tree representing one of built-in functions\n * like \"position()\" or \"number()\".\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionCode"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.CoreFunction(int, org.apache.commons.jxpath.ri.compiler.Expression[])",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 20)",
        "(line 47,col 9)-(line 47,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getFunctionCode()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getFunctionName()",
      "begin_line": 54,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg1()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg2()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getArg3()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.getArgumentCount()",
      "begin_line": 130,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.computeContextDependent()",
      "begin_line": 142,
      "end_line": 186,
      "comment": "\n     * Returns true if any argument is context dependent or if\n     * the function is last(), position(), boolean(), local-name(),\n     * name(), string(), lang(), number().\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 185,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.toString()",
      "begin_line": 188,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 49)",
        "(line 190,col 9)-(line 190,col 41)",
        "(line 191,col 9)-(line 191,col 27)",
        "(line 192,col 9)-(line 192,col 43)",
        "(line 193,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 27)",
        "(line 202,col 9)-(line 202,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.compute(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 212,
      "end_line": 276,
      "comment": "\n     * Computes a built-in function\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLast(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 278,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 26)",
        "(line 282,col 9)-(line 282,col 47)",
        "(line 283,col 9)-(line 283,col 24)",
        "(line 284,col 9)-(line 284,col 22)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionPosition(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 296,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 26)",
        "(line 298,col 9)-(line 298,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionCount(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 301,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 26)",
        "(line 303,col 9)-(line 303,col 36)",
        "(line 304,col 9)-(line 304,col 22)",
        "(line 305,col 9)-(line 305,col 45)",
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLang(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 328,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 26)",
        "(line 330,col 9)-(line 330,col 79)",
        "(line 331,col 9)-(line 331,col 75)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionID(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 338,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 26)",
        "(line 340,col 9)-(line 340,col 77)",
        "(line 341,col 9)-(line 341,col 65)",
        "(line 342,col 9)-(line 342,col 78)",
        "(line 343,col 9)-(line 343,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionKey(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 346,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 26)",
        "(line 348,col 9)-(line 348,col 78)",
        "(line 349,col 9)-(line 349,col 80)",
        "(line 350,col 9)-(line 350,col 65)",
        "(line 351,col 9)-(line 351,col 78)",
        "(line 352,col 9)-(line 352,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNamespaceURI(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 355,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 26)",
        "(line 362,col 9)-(line 362,col 48)",
        "(line 363,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionLocalName(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 374,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 379,col 26)",
        "(line 380,col 9)-(line 380,col 48)",
        "(line 381,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 388,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionName(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 391,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 392,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 26)",
        "(line 397,col 9)-(line 397,col 48)",
        "(line 398,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 405,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionString(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 408,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 26)",
        "(line 413,col 9)-(line 413,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionConcat(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 416,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 417,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 420,col 49)",
        "(line 421,col 9)-(line 421,col 43)",
        "(line 422,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionStartsWith(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 428,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 26)",
        "(line 430,col 9)-(line 430,col 77)",
        "(line 431,col 9)-(line 431,col 77)",
        "(line 432,col 9)-(line 432,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionContains(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 435,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 26)",
        "(line 437,col 9)-(line 437,col 77)",
        "(line 438,col 9)-(line 438,col 77)",
        "(line 439,col 9)-(line 439,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstringBefore(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 442,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 26)",
        "(line 444,col 9)-(line 444,col 77)",
        "(line 445,col 9)-(line 445,col 77)",
        "(line 446,col 9)-(line 446,col 35)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 450,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstringAfter(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 453,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 26)",
        "(line 455,col 9)-(line 455,col 77)",
        "(line 456,col 9)-(line 456,col 77)",
        "(line 457,col 9)-(line 457,col 35)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSubstring(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 464,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 36)",
        "(line 466,col 9)-(line 468,col 9)",
        "(line 470,col 9)-(line 470,col 77)",
        "(line 471,col 9)-(line 471,col 79)",
        "(line 472,col 9)-(line 474,col 9)",
        "(line 476,col 9)-(line 476,col 32)",
        "(line 477,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 510,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionStringLength(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 513,
      "end_line": 523,
      "comment": "",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 17)",
        "(line 515,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 522,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNormalizeSpace(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 525,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 26)",
        "(line 527,col 9)-(line 527,col 76)",
        "(line 528,col 9)-(line 528,col 39)",
        "(line 529,col 9)-(line 529,col 20)",
        "(line 530,col 9)-(line 530,col 22)",
        "(line 531,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 553,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTranslate(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 556,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 26)",
        "(line 558,col 9)-(line 558,col 77)",
        "(line 559,col 9)-(line 559,col 77)",
        "(line 560,col 9)-(line 560,col 77)",
        "(line 561,col 9)-(line 561,col 40)",
        "(line 562,col 9)-(line 562,col 20)",
        "(line 563,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 575,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionBoolean(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 578,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 26)",
        "(line 580,col 9)-(line 582,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNot(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 585,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 26)",
        "(line 587,col 9)-(line 589,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionTrue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 592,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 26)",
        "(line 594,col 9)-(line 594,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFalse(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 597,
      "end_line": 600,
      "comment": "",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 26)",
        "(line 599,col 9)-(line 599,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNull(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 602,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 26)",
        "(line 604,col 9)-(line 604,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionNumber(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 607,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 608,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 26)",
        "(line 612,col 9)-(line 612,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionSum(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 615,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 26)",
        "(line 617,col 9)-(line 617,col 46)",
        "(line 618,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 631,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFloor(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 634,
      "end_line": 638,
      "comment": "",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 26)",
        "(line 636,col 9)-(line 636,col 76)",
        "(line 637,col 9)-(line 637,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionCeiling(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 640,
      "end_line": 644,
      "comment": "",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 26)",
        "(line 642,col 9)-(line 642,col 76)",
        "(line 643,col 9)-(line 643,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionRound(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 646,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 26)",
        "(line 648,col 9)-(line 648,col 76)",
        "(line 649,col 9)-(line 649,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.functionFormatNumber(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 652,
      "end_line": 686,
      "comment": "",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 36)",
        "(line 654,col 9)-(line 656,col 9)",
        "(line 658,col 9)-(line 659,col 69)",
        "(line 660,col 9)-(line 661,col 69)",
        "(line 663,col 9)-(line 663,col 44)",
        "(line 664,col 9)-(line 680,col 9)",
        "(line 682,col 9)-(line 682,col 74)",
        "(line 683,col 9)-(line 683,col 48)",
        "(line 684,col 9)-(line 684,col 46)",
        "(line 685,col 9)-(line 685,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreFunction.assertArgCount(int)",
      "begin_line": 688,
      "end_line": 693,
      "comment": "",
      "child_ranges": [
        "(line 689,col 9)-(line 692,col 9)"
      ]
    }
  ]
}