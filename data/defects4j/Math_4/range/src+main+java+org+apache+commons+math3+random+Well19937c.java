{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/random/Well19937c.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Well19937c",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.AbstractWell"
      ],
      "begin_line": 35,
      "end_line": 115,
      "comment": " This class implements the WELL19937c pseudo-random number generator\n * from Fran\u0026ccedil;ois Panneton, Pierre L\u0027Ecuyer and Makoto Matsumoto.\n\n * \u003cp\u003eThis generator is described in a paper by Fran\u0026ccedil;ois Panneton,\n * Pierre L\u0027Ecuyer and Makoto Matsumoto \u003ca\n * href\u003d\"http://www.iro.umontreal.ca/~lecuyer/myftp/papers/wellrng.pdf\"\u003eImproved\n * Long-Period Generators Based on Linear Recurrences Modulo 2\u003c/a\u003e ACM\n * Transactions on Mathematical Software, 32, 1 (2006). The errata for the paper\n * are in \u003ca href\u003d\"http://www.iro.umontreal.ca/~lecuyer/myftp/papers/wellrng-errata.txt\"\u003ewellrng-errata.txt\u003c/a\u003e.\u003c/p\u003e\n\n * @see \u003ca href\u003d\"http://www.iro.umontreal.ca/~panneton/WELLRNG.html\"\u003eWELL Random number generator\u003c/a\u003e\n * @version $Id$\n * @since 2.2\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "K"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Number of bits in the pool. "
    },
    {
      "type": "field",
      "varNames": [
        "M1"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " First parameter of the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "M2"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Second parameter of the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "M3"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Third parameter of the algorithm. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.Well19937c.Well19937c()",
      "begin_line": 56,
      "end_line": 58,
      "comment": " Creates a new random number generator.\n     * \u003cp\u003eThe instance is initialized using the current time as the\n     * seed.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.Well19937c.Well19937c(int)",
      "begin_line": 63,
      "end_line": 65,
      "comment": " Creates a new random number generator using a single int seed.\n     * @param seed the initial seed (32 bits integer)\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.Well19937c.Well19937c(int[])",
      "begin_line": 71,
      "end_line": 73,
      "comment": " Creates a new random number generator using an int array seed.\n     * @param seed the initial seed (32 bits integers array), if null\n     * the seed of the generator will be related to the current time\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.Well19937c.Well19937c(long)",
      "begin_line": 78,
      "end_line": 80,
      "comment": " Creates a new random number generator using a single long seed.\n     * @param seed the initial seed (64 bits integer)\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.Well19937c.next(int)",
      "begin_line": 83,
      "end_line": 113,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 41)",
        "(line 87,col 9)-(line 87,col 41)",
        "(line 89,col 9)-(line 89,col 38)",
        "(line 90,col 9)-(line 90,col 42)",
        "(line 91,col 9)-(line 91,col 42)",
        "(line 92,col 9)-(line 92,col 42)",
        "(line 94,col 9)-(line 94,col 79)",
        "(line 95,col 9)-(line 95,col 65)",
        "(line 96,col 9)-(line 96,col 57)",
        "(line 97,col 9)-(line 97,col 36)",
        "(line 98,col 9)-(line 98,col 80)",
        "(line 100,col 9)-(line 100,col 26)",
        "(line 101,col 9)-(line 101,col 26)",
        "(line 102,col 9)-(line 102,col 34)",
        "(line 103,col 9)-(line 103,col 32)",
        "(line 108,col 9)-(line 108,col 44)",
        "(line 109,col 9)-(line 109,col 44)",
        "(line 111,col 9)-(line 111,col 34)"
      ]
    }
  ]
}