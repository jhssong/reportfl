{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/primes/PollardRho.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PollardRho",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 165,
      "comment": "\n * Implementation of the Pollard\u0027s rho factorization algorithm.\n * @version $Id$\n * @since 3.2\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.primes.PollardRho.PollardRho()",
      "begin_line": 34,
      "end_line": 35,
      "comment": "\n     * Hide utility class.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.primes.PollardRho.primeFactors(int)",
      "begin_line": 42,
      "end_line": 59,
      "comment": "\n     * Factorization using Pollard\u0027s rho algorithm.\n     * @param n number to factors, must be \u0026gt; 0\n     * @return the list of prime factors of n.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 63)",
        "(line 45,col 9)-(line 45,col 55)",
        "(line 46,col 9)-(line 48,col 9)",
        "(line 50,col 9)-(line 53,col 9)",
        "(line 55,col 9)-(line 55,col 34)",
        "(line 56,col 9)-(line 56,col 29)",
        "(line 57,col 9)-(line 57,col 33)",
        "(line 58,col 9)-(line 58,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.primes.PollardRho.rhoBrent(int)",
      "begin_line": 73,
      "end_line": 114,
      "comment": "\n     * Implementation of the Pollard\u0027s rho factorization algorithm.\n     * \u003cp\u003e\n     * This implementation follows the paper \"An improved Monte Carlo factorization algorithm\"\n     * by Richard P. Brent. This avoids the triple computation of f(x) typically found in Pollard\u0027s\n     * rho implementations. It also batches several gcd computation into 1.\n     * \u003cp\u003e\n     * The backtracking is not implemented as we deal only with semi-primes.\n     *\n     * @param n number to factor, must be semi-prime.\n     * @return a prime factor of n.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 25)",
        "(line 75,col 9)-(line 75,col 25)",
        "(line 76,col 9)-(line 76,col 42)",
        "(line 77,col 9)-(line 77,col 19)",
        "(line 78,col 9)-(line 78,col 18)",
        "(line 79,col 9)-(line 113,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.primes.PollardRho.gcdPositive(int, int)",
      "begin_line": 133,
      "end_line": 164,
      "comment": "\n     * Gcd between two positive numbers.\n     * \u003cp\u003e\n     * Gets the greatest common divisor of two numbers, using the \"binary gcd\" method,\n     * which avoids division and modulo operations. See Knuth 4.5.2 algorithm B.\n     * This algorithm is due to Josef Stein (1961).\n     * \u003c/p\u003e\n     * Special cases:\n     * \u003cul\u003e\n     * \u003cli\u003eThe result of {@code gcd(x, x)}, {@code gcd(0, x)} and {@code gcd(x, 0)} is the value of {@code x}.\u003c/li\u003e\n     * \u003cli\u003eThe invocation {@code gcd(0, 0)} is the only one which returns {@code 0}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a first number, must be \u0026ge; 0\n     * @param b second number, must be \u0026ge; 0\n     * @return gcd(a,b)\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 140,col 9)",
        "(line 143,col 9)-(line 143,col 59)",
        "(line 144,col 9)-(line 144,col 20)",
        "(line 145,col 9)-(line 145,col 59)",
        "(line 146,col 9)-(line 146,col 20)",
        "(line 147,col 9)-(line 147,col 53)",
        "(line 153,col 9)-(line 160,col 9)",
        "(line 163,col 9)-(line 163,col 26)"
      ]
    }
  ]
}