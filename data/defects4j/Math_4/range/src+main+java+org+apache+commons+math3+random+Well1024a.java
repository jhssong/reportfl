{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/random/Well1024a.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Well1024a",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.AbstractWell"
      ],
      "begin_line": 35,
      "end_line": 106,
      "comment": " This class implements the WELL1024a pseudo-random number generator\n * from Fran\u0026ccedil;ois Panneton, Pierre L\u0027Ecuyer and Makoto Matsumoto.\n\n * \u003cp\u003eThis generator is described in a paper by Fran\u0026ccedil;ois Panneton,\n * Pierre L\u0027Ecuyer and Makoto Matsumoto \u003ca\n * href\u003d\"http://www.iro.umontreal.ca/~lecuyer/myftp/papers/wellrng.pdf\"\u003eImproved\n * Long-Period Generators Based on Linear Recurrences Modulo 2\u003c/a\u003e ACM\n * Transactions on Mathematical Software, 32, 1 (2006). The errata for the paper\n * are in \u003ca href\u003d\"http://www.iro.umontreal.ca/~lecuyer/myftp/papers/wellrng-errata.txt\"\u003ewellrng-errata.txt\u003c/a\u003e.\u003c/p\u003e\n\n * @see \u003ca href\u003d\"http://www.iro.umontreal.ca/~panneton/WELLRNG.html\"\u003eWELL Random number generator\u003c/a\u003e\n * @version $Id$\n * @since 2.2\n\n "
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
      "signature": "org.apache.commons.math3.random.Well1024a.Well1024a()",
      "begin_line": 56,
      "end_line": 58,
      "comment": " Creates a new random number generator.\n     * \u003cp\u003eThe instance is initialized using the current time as the\n     * seed.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.Well1024a.Well1024a(int)",
      "begin_line": 63,
      "end_line": 65,
      "comment": " Creates a new random number generator using a single int seed.\n     * @param seed the initial seed (32 bits integer)\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.Well1024a.Well1024a(int[])",
      "begin_line": 71,
      "end_line": 73,
      "comment": " Creates a new random number generator using an int array seed.\n     * @param seed the initial seed (32 bits integers array), if null\n     * the seed of the generator will be related to the current time\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.Well1024a.Well1024a(long)",
      "begin_line": 78,
      "end_line": 80,
      "comment": " Creates a new random number generator using a single long seed.\n     * @param seed the initial seed (64 bits integer)\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.Well1024a.next(int)",
      "begin_line": 83,
      "end_line": 105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 41)",
        "(line 88,col 9)-(line 88,col 38)",
        "(line 89,col 9)-(line 89,col 42)",
        "(line 90,col 9)-(line 90,col 42)",
        "(line 91,col 9)-(line 91,col 42)",
        "(line 93,col 9)-(line 93,col 35)",
        "(line 94,col 9)-(line 94,col 49)",
        "(line 95,col 9)-(line 95,col 65)",
        "(line 96,col 9)-(line 96,col 36)",
        "(line 97,col 9)-(line 97,col 80)",
        "(line 99,col 9)-(line 99,col 26)",
        "(line 100,col 9)-(line 100,col 26)",
        "(line 101,col 9)-(line 101,col 32)",
        "(line 103,col 9)-(line 103,col 34)"
      ]
    }
  ]
}