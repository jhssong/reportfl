{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/random/AbstractWell.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractWell",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.BitsStreamGenerator",
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 186,
      "comment": " This abstract class implements the WELL class of pseudo-random number generator\n * from Fran\u0026ccedil;ois Panneton, Pierre L\u0027Ecuyer and Makoto Matsumoto.\n\n * \u003cp\u003eThis generator is described in a paper by Fran\u0026ccedil;ois Panneton,\n * Pierre L\u0027Ecuyer and Makoto Matsumoto \u003ca\n * href\u003d\"http://www.iro.umontreal.ca/~lecuyer/myftp/papers/wellrng.pdf\"\u003eImproved\n * Long-Period Generators Based on Linear Recurrences Modulo 2\u003c/a\u003e ACM\n * Transactions on Mathematical Software, 32, 1 (2006). The errata for the paper\n * are in \u003ca href\u003d\"http://www.iro.umontreal.ca/~lecuyer/myftp/papers/wellrng-errata.txt\"\u003ewellrng-errata.txt\u003c/a\u003e.\u003c/p\u003e\n\n * @see \u003ca href\u003d\"http://www.iro.umontreal.ca/~panneton/WELLRNG.html\"\u003eWELL Random number generator\u003c/a\u003e\n * @version $Id$\n * @since 2.2\n\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Current index in the bytes pool. "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Bytes pool. "
    },
    {
      "type": "field",
      "varNames": [
        "iRm1"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Index indirection table giving for each index its predecessor taking table size into account. "
    },
    {
      "type": "field",
      "varNames": [
        "iRm2"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Index indirection table giving for each index its second predecessor taking table size into account. "
    },
    {
      "type": "field",
      "varNames": [
        "i1"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Index indirection table giving for each index the value index + m1 taking table size into account. "
    },
    {
      "type": "field",
      "varNames": [
        "i2"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Index indirection table giving for each index the value index + m2 taking table size into account. "
    },
    {
      "type": "field",
      "varNames": [
        "i3"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Index indirection table giving for each index the value index + m3 taking table size into account. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.AbstractWell.AbstractWell(int, int, int, int)",
      "begin_line": 71,
      "end_line": 73,
      "comment": " Creates a new random number generator.\n     * \u003cp\u003eThe instance is initialized using the current time plus the\n     * system identity hash code of this instance as the seed.\u003c/p\u003e\n     * @param k number of bits in the pool (not necessarily a multiple of 32)\n     * @param m1 first parameter of the algorithm\n     * @param m2 second parameter of the algorithm\n     * @param m3 third parameter of the algorithm\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.AbstractWell.AbstractWell(int, int, int, int, int)",
      "begin_line": 82,
      "end_line": 84,
      "comment": " Creates a new random number generator using a single int seed.\n     * @param k number of bits in the pool (not necessarily a multiple of 32)\n     * @param m1 first parameter of the algorithm\n     * @param m2 second parameter of the algorithm\n     * @param m3 third parameter of the algorithm\n     * @param seed the initial seed (32 bits integer)\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.AbstractWell.AbstractWell(int, int, int, int, int[])",
      "begin_line": 94,
      "end_line": 122,
      "comment": " Creates a new random number generator using an int array seed.\n     * @param k number of bits in the pool (not necessarily a multiple of 32)\n     * @param m1 first parameter of the algorithm\n     * @param m2 second parameter of the algorithm\n     * @param m3 third parameter of the algorithm\n     * @param seed the initial seed (32 bits integers array), if null\n     * the seed of the generator will be related to the current time\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 25)",
        "(line 100,col 9)-(line 100,col 38)",
        "(line 101,col 9)-(line 101,col 33)",
        "(line 102,col 9)-(line 102,col 24)",
        "(line 106,col 9)-(line 106,col 26)",
        "(line 107,col 9)-(line 107,col 26)",
        "(line 108,col 9)-(line 108,col 26)",
        "(line 109,col 9)-(line 109,col 26)",
        "(line 110,col 9)-(line 110,col 26)",
        "(line 111,col 9)-(line 117,col 9)",
        "(line 120,col 9)-(line 120,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.AbstractWell.AbstractWell(int, int, int, int, long)",
      "begin_line": 131,
      "end_line": 133,
      "comment": " Creates a new random number generator using a single long seed.\n     * @param k number of bits in the pool (not necessarily a multiple of 32)\n     * @param m1 first parameter of the algorithm\n     * @param m2 second parameter of the algorithm\n     * @param m3 third parameter of the algorithm\n     * @param seed the initial seed (64 bits integer)\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.AbstractWell.setSeed(int)",
      "begin_line": 140,
      "end_line": 143,
      "comment": " Reinitialize the generator as if just built with the given int seed.\n     * \u003cp\u003eThe state of the generator is exactly the same as a new\n     * generator built with the same seed.\u003c/p\u003e\n     * @param seed the initial seed (32 bits integer)\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.AbstractWell.setSeed(int[])",
      "begin_line": 152,
      "end_line": 170,
      "comment": " Reinitialize the generator as if just built with the given int array seed.\n     * \u003cp\u003eThe state of the generator is exactly the same as a new\n     * generator built with the same seed.\u003c/p\u003e\n     * @param seed the initial seed (32 bits integers array). If null\n     * the seed of the generator will be the system time plus the system identity\n     * hash code of the instance.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 159,col 73)",
        "(line 161,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 18)",
        "(line 169,col 9)-(line 169,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.AbstractWell.setSeed(long)",
      "begin_line": 177,
      "end_line": 180,
      "comment": " Reinitialize the generator as if just built with the given long seed.\n     * \u003cp\u003eThe state of the generator is exactly the same as a new\n     * generator built with the same seed.\u003c/p\u003e\n     * @param seed the initial seed (64 bits integer)\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.AbstractWell.next(int)",
      "begin_line": 183,
      "end_line": 184,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}