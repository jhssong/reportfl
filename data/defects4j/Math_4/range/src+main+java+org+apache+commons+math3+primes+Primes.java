{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/primes/Primes.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Primes",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 130,
      "comment": "\n * Methods related to prime numbers in the range of \u003ccode\u003eint\u003c/code\u003e:\n * \u003cul\u003e\n * \u003cli\u003eprimality test\u003c/li\u003e\n * \u003cli\u003eprime number generation\u003c/li\u003e\n * \u003cli\u003efactorization\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @version $Id$\n * @since 3.2\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.primes.Primes.Primes()",
      "begin_line": 41,
      "end_line": 42,
      "comment": "\n     * Hide utility class.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.primes.Primes.isPrime(int)",
      "begin_line": 54,
      "end_line": 65,
      "comment": "\n     * Primality test: tells if the argument is a (provable) prime or not.\n     * \u003cp\u003e\n     * It uses the Miller-Rabin probabilistic test in such a way that a result is guaranteed:\n     * it uses the firsts prime numbers as successive base (see Handbook of applied cryptography\n     * by Menezes, table 4.1).\n     *\n     * @param n number to test.\n     * @return true if n is prime. (All numbers \u0026lt; 2 return false).\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 57,col 9)",
        "(line 59,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.primes.Primes.nextPrime(int)",
      "begin_line": 74,
      "end_line": 109,
      "comment": "\n     * Return the smallest prime greater than or equal to n.\n     *\n     * @param n a positive number.\n     * @return the smallest prime greater than or equal to n.\n     * @throws MathIllegalArgumentException if n \u0026lt; 0.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 18)",
        "(line 82,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 92,col 9)-(line 92,col 30)",
        "(line 93,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.primes.Primes.primeFactors(int)",
      "begin_line": 118,
      "end_line": 128,
      "comment": "\n     * Prime factors decomposition\n     *\n     * @param n number to factorize: must be \u0026ge; 2\n     * @return list of prime factors of n\n     * @throws MathIllegalArgumentException if n \u0026lt; 2.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 126,col 9)-(line 126,col 44)"
      ]
    }
  ]
}