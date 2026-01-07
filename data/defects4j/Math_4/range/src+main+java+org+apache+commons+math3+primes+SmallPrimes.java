{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/primes/SmallPrimes.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SmallPrimes",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 188,
      "comment": "\n * Utility methods to work on primes within the \u003ccode\u003eint\u003c/code\u003e range.\n * @version $Id$\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "PRIMES"
      ],
      "begin_line": 40,
      "end_line": 66,
      "comment": "\n     * The first 512 prime numbers.\n     * \u003cp\u003e\n     * It contains all primes smaller or equal to the cubic square of Integer.MAX_VALUE.\n     * As a result, \u003ccode\u003eint\u003c/code\u003e numbers which are not reduced by those primes are guaranteed\n     * to be either prime or semi prime.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PRIMES_LAST"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The last number in PRIMES. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.primes.SmallPrimes.SmallPrimes()",
      "begin_line": 74,
      "end_line": 75,
      "comment": "\n     * Hide utility class.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.primes.SmallPrimes.smallTrialDivision(int, java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 83,
      "end_line": 91,
      "comment": "\n     * Extract small factors.\n     * @param n the number to factor, must be \u0026gt; 0.\n     * @param factors the list where to add the factors.\n     * @return the part of n which remains to be factored, it is either a prime or a semi-prime\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.primes.SmallPrimes.boundedTrialDivision(int, int, java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 100,
      "end_line": 121,
      "comment": "\n     * Extract factors in the range \u003ccode\u003ePRIME_LAST+2\u003c/code\u003e to \u003ccode\u003emaxFactors\u003c/code\u003e.\n     * @param n the number to factorize, must be \u003e\u003d PRIME_LAST+2 and must not contain any factor below PRIME_LAST+2\n     * @param maxFactor the upper bound of trial division: if it is reached, the method gives up and returns n.\n     * @param factors the list where to add the factors.\n     * @return  n or 1 if factorization is completed.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 32)",
        "(line 103,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.primes.SmallPrimes.trialDivision(int)",
      "begin_line": 128,
      "end_line": 138,
      "comment": "\n     * Factorization by trial division.\n     * @param n the number to factor\n     * @return the list of prime factors of n\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 65)",
        "(line 130,col 9)-(line 130,col 43)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 135,col 9)-(line 135,col 49)",
        "(line 136,col 9)-(line 136,col 48)",
        "(line 137,col 9)-(line 137,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.primes.SmallPrimes.millerRabinPrimeTest(int)",
      "begin_line": 149,
      "end_line": 187,
      "comment": "\n     * Miller-Rabin probabilistic primality test for int type, used in such a way that a result is always guaranteed.\n     * \u003cp\u003e\n     * It uses the prime numbers as successive base therefore it is guaranteed to be always correct.\n     * (see Handbook of applied cryptography by Menezes, table 4.1)\n     *\n     * @param n number to test: an odd integer \u0026ge; 3\n     * @return true if n is prime. false if n is definitely composite.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 34)",
        "(line 151,col 9)-(line 151,col 61)",
        "(line 152,col 9)-(line 152,col 35)",
        "(line 154,col 9)-(line 154,col 18)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 46)",
        "(line 165,col 9)-(line 165,col 46)",
        "(line 167,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 20)"
      ]
    }
  ]
}