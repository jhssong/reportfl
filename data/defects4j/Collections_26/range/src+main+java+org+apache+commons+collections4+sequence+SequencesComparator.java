{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/sequence/SequencesComparator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SequencesComparator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 59,
      "end_line": 348,
      "comment": "\n * This class allows to compare two objects sequences.\n * \u003cp\u003e\n * The two sequences can hold any object type, as only the \u003ccode\u003eequals\u003c/code\u003e\n * method is used to compare the elements of the sequences. It is guaranteed\n * that the comparisons will always be done as \u003ccode\u003eo1.equals(o2)\u003c/code\u003e where\n * \u003ccode\u003eo1\u003c/code\u003e belongs to the first sequence and \u003ccode\u003eo2\u003c/code\u003e belongs to\n * the second sequence. This can be important if subclassing is used for some\n * elements in the first sequence and the \u003ccode\u003eequals\u003c/code\u003e method is\n * specialized.\n * \u003cp\u003e\n * Comparison can be seen from two points of view: either as giving the smallest\n * modification allowing to transform the first sequence into the second one, or\n * as giving the longest sequence which is a subsequence of both initial\n * sequences. The \u003ccode\u003eequals\u003c/code\u003e method is used to compare objects, so any\n * object can be put into sequences. Modifications include deleting, inserting\n * or keeping one object, starting from the beginning of the first sequence.\n * \u003cp\u003e\n * This class implements the comparison algorithm, which is the very efficient\n * algorithm from Eugene W. Myers\n * \u003ca href\u003d\"http://www.cis.upenn.edu/~bcpierce/courses/dd/papers/diff.ps\"\u003e\n * An O(ND) Difference Algorithm and Its Variations\u003c/a\u003e. This algorithm produces\n * the shortest possible\n * {@link EditScript edit script}\n * containing all the\n * {@link EditCommand commands}\n * needed to transform the first sequence into the second one.\n *\n * @see EditScript\n * @see EditCommand\n * @see CommandVisitor\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "sequence1"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " First sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "sequence2"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Second sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "equator"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The equator used for testing object equality. "
    },
    {
      "type": "field",
      "varNames": [
        "vDown"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Temporary variables. "
    },
    {
      "type": "field",
      "varNames": [
        "vUp"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.sequence.SequencesComparator.SequencesComparator(java.util.List\u003cT\u003e, java.util.List\u003cT\u003e)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Simple constructor.\n     * \u003cp\u003e\n     * Creates a new instance of SequencesComparator using a {@link DefaultEquator}.\n     * \u003cp\u003e\n     * It is \u003cem\u003eguaranteed\u003c/em\u003e that the comparisons will always be done as\n     * \u003ccode\u003eo1.equals(o2)\u003c/code\u003e where \u003ccode\u003eo1\u003c/code\u003e belongs to the first\n     * sequence and \u003ccode\u003eo2\u003c/code\u003e belongs to the second sequence. This can be\n     * important if subclassing is used for some elements in the first sequence\n     * and the \u003ccode\u003eequals\u003c/code\u003e method is specialized.\n     *\n     * @param sequence1  first sequence to be compared\n     * @param sequence2  second sequence to be compared\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.sequence.SequencesComparator.SequencesComparator(java.util.List\u003cT\u003e, java.util.List\u003cT\u003e, org.apache.commons.collections4.Equator\u003c? super T\u003e)",
      "begin_line": 105,
      "end_line": 113,
      "comment": "\n     * Simple constructor.\n     * \u003cp\u003e\n     * Creates a new instance of SequencesComparator with a custom {@link Equator}.\n     * \u003cp\u003e\n     * It is \u003cem\u003eguaranteed\u003c/em\u003e that the comparisons will always be done as\n     * \u003ccode\u003eEquator.equate(o1, o2)\u003c/code\u003e where \u003ccode\u003eo1\u003c/code\u003e belongs to the first\n     * sequence and \u003ccode\u003eo2\u003c/code\u003e belongs to the second sequence.\n     *\n     * @param sequence1  first sequence to be compared\n     * @param sequence2  second sequence to be compared\n     * @param equator  the equator to use for testing object equality\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 35)",
        "(line 107,col 9)-(line 107,col 35)",
        "(line 108,col 9)-(line 108,col 31)",
        "(line 110,col 9)-(line 110,col 65)",
        "(line 111,col 9)-(line 111,col 30)",
        "(line 112,col 9)-(line 112,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.SequencesComparator.getScript()",
      "begin_line": 128,
      "end_line": 132,
      "comment": "\n     * Get the {@link EditScript} object.\n     * \u003cp\u003e\n     * It is guaranteed that the objects embedded in the {@link InsertCommand\n     * insert commands} come from the second sequence and that the objects\n     * embedded in either the {@link DeleteCommand delete commands} or\n     * {@link KeepCommand keep commands} come from the first sequence. This can\n     * be important if subclassing is used for some elements in the first\n     * sequence and the \u003ccode\u003eequals\u003c/code\u003e method is specialized.\n     *\n     * @return the edit script resulting from the comparison of the two\n     *         sequences\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 57)",
        "(line 130,col 9)-(line 130,col 70)",
        "(line 131,col 9)-(line 131,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.SequencesComparator.buildSnake(int, int, int, int)",
      "begin_line": 143,
      "end_line": 151,
      "comment": "\n     * Build a snake.\n     *\n     * @param start  the value of the start of the snake\n     * @param diag  the value of the diagonal of the snake\n     * @param end1  the value of the end of the first sequence to be compared\n     * @param end2  the value of the end of the second sequence to be compared\n     * @return the snake built\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 24)",
        "(line 145,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.SequencesComparator.getMiddleSnake(int, int, int, int)",
      "begin_line": 169,
      "end_line": 240,
      "comment": "\n     * Get the middle snake corresponding to two subsequences of the\n     * main sequences.\n     * \u003cp\u003e\n     * The snake is found using the MYERS Algorithm (this algorithms has\n     * also been implemented in the GNU diff program). This algorithm is\n     * explained in Eugene Myers article:\n     * \u003ca href\u003d\"http://www.cs.arizona.edu/people/gene/PAPERS/diff.ps\"\u003e\n     * An O(ND) Difference Algorithm and Its Variations\u003c/a\u003e.\n     *\n     * @param start1  the begin of the first sequence to be compared\n     * @param end1  the end of the first sequence to be compared\n     * @param start2  the begin of the second sequence to be compared\n     * @param end2  the end of the second sequence to be compared\n     * @return the middle snake\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 36)",
        "(line 173,col 9)-(line 173,col 36)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 178,col 33)",
        "(line 179,col 9)-(line 179,col 33)",
        "(line 180,col 9)-(line 180,col 62)",
        "(line 181,col 9)-(line 181,col 33)",
        "(line 182,col 9)-(line 182,col 35)",
        "(line 184,col 9)-(line 236,col 9)",
        "(line 239,col 9)-(line 239,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.SequencesComparator.buildScript(int, int, int, int, org.apache.commons.collections4.sequence.EditScript\u003cT\u003e)",
      "begin_line": 252,
      "end_line": 291,
      "comment": "\n     * Build an edit script.\n     *\n     * @param start1  the begin of the first sequence to be compared\n     * @param end1  the end of the first sequence to be compared\n     * @param start2  the begin of the second sequence to be compared\n     * @param end2  the end of the second sequence to be compared\n     * @param script the edited script\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 72)",
        "(line 257,col 9)-(line 290,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Snake",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 297,
      "end_line": 347,
      "comment": "\n     * This class is a simple placeholder to hold the end part of a path\n     * under construction in a {@link SequencesComparator SequencesComparator}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 300,
      "end_line": 300,
      "comment": " Start index. "
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": " End index. "
    },
    {
      "type": "field",
      "varNames": [
        "diag"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": " Diagonal number. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.sequence.SequencesComparator.Snake.Snake(int, int, int)",
      "begin_line": 315,
      "end_line": 319,
      "comment": "\n         * Simple constructor. Creates a new instance of Snake with specified indices.\n         *\n         * @param start  start index of the snake\n         * @param end  end index of the snake\n         * @param diag  diagonal number\n         ",
      "child_ranges": [
        "(line 316,col 13)-(line 316,col 31)",
        "(line 317,col 13)-(line 317,col 29)",
        "(line 318,col 13)-(line 318,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.SequencesComparator.Snake.getStart()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n         * Get the start index of the snake.\n         *\n         * @return start index of the snake\n         ",
      "child_ranges": [
        "(line 327,col 13)-(line 327,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.SequencesComparator.Snake.getEnd()",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\n         * Get the end index of the snake.\n         *\n         * @return end index of the snake\n         ",
      "child_ranges": [
        "(line 336,col 13)-(line 336,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.SequencesComparator.Snake.getDiag()",
      "begin_line": 344,
      "end_line": 346,
      "comment": "\n         * Get the diagonal number of the snake.\n         *\n         * @return diagonal number of the snake\n         ",
      "child_ranges": [
        "(line 345,col 13)-(line 345,col 24)"
      ]
    }
  ]
}