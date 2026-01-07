{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/analysis/polynomials/PolynomialFunctionLagrangeFormTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionLagrangeFormTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 149,
      "comment": "\n * Testcase for Lagrange form of polynomial function.\n * \u003cp\u003e\n * We use n+1 points to interpolate a polynomial of degree n. This should\n * give us the exact same polynomial as result. Thus we can use a very\n * small tolerance to account only for round-off errors.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeFormTest.testLinearFunction()",
      "begin_line": 36,
      "end_line": 60,
      "comment": "\n     * Test of polynomial for the linear function.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 41)",
        "(line 38,col 9)-(line 38,col 59)",
        "(line 41,col 9)-(line 41,col 34)",
        "(line 42,col 9)-(line 42,col 35)",
        "(line 43,col 9)-(line 43,col 53)",
        "(line 45,col 9)-(line 45,col 16)",
        "(line 45,col 18)-(line 45,col 33)",
        "(line 45,col 35)-(line 45,col 54)",
        "(line 46,col 9)-(line 46,col 50)",
        "(line 48,col 9)-(line 48,col 16)",
        "(line 48,col 18)-(line 48,col 33)",
        "(line 48,col 35)-(line 48,col 54)",
        "(line 49,col 9)-(line 49,col 50)",
        "(line 51,col 9)-(line 51,col 16)",
        "(line 51,col 18)-(line 51,col 32)",
        "(line 51,col 34)-(line 51,col 53)",
        "(line 52,col 9)-(line 52,col 50)",
        "(line 54,col 9)-(line 54,col 36)",
        "(line 56,col 9)-(line 56,col 32)",
        "(line 57,col 9)-(line 57,col 34)",
        "(line 58,col 9)-(line 58,col 44)",
        "(line 59,col 9)-(line 59,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeFormTest.testQuadraticFunction()",
      "begin_line": 65,
      "end_line": 90,
      "comment": "\n     * Test of polynomial for the quadratic function.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 41)",
        "(line 67,col 9)-(line 67,col 59)",
        "(line 70,col 9)-(line 70,col 40)",
        "(line 71,col 9)-(line 71,col 41)",
        "(line 72,col 9)-(line 72,col 53)",
        "(line 74,col 9)-(line 74,col 16)",
        "(line 74,col 18)-(line 74,col 32)",
        "(line 74,col 34)-(line 74,col 53)",
        "(line 75,col 9)-(line 75,col 50)",
        "(line 77,col 9)-(line 77,col 16)",
        "(line 77,col 18)-(line 77,col 33)",
        "(line 77,col 35)-(line 77,col 54)",
        "(line 78,col 9)-(line 78,col 50)",
        "(line 80,col 9)-(line 80,col 17)",
        "(line 80,col 19)-(line 80,col 34)",
        "(line 80,col 36)-(line 80,col 55)",
        "(line 81,col 9)-(line 81,col 50)",
        "(line 83,col 9)-(line 83,col 36)",
        "(line 85,col 9)-(line 85,col 32)",
        "(line 86,col 9)-(line 86,col 34)",
        "(line 87,col 9)-(line 87,col 44)",
        "(line 88,col 9)-(line 88,col 43)",
        "(line 89,col 9)-(line 89,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeFormTest.testQuinticFunction()",
      "begin_line": 95,
      "end_line": 123,
      "comment": "\n     * Test of polynomial for the quintic function.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 41)",
        "(line 97,col 9)-(line 97,col 59)",
        "(line 100,col 9)-(line 100,col 56)",
        "(line 101,col 9)-(line 101,col 63)",
        "(line 102,col 9)-(line 102,col 53)",
        "(line 104,col 9)-(line 104,col 16)",
        "(line 104,col 18)-(line 104,col 32)",
        "(line 104,col 34)-(line 104,col 53)",
        "(line 105,col 9)-(line 105,col 50)",
        "(line 107,col 9)-(line 107,col 17)",
        "(line 107,col 19)-(line 107,col 33)",
        "(line 107,col 35)-(line 107,col 54)",
        "(line 108,col 9)-(line 108,col 50)",
        "(line 110,col 9)-(line 110,col 16)",
        "(line 110,col 18)-(line 110,col 34)",
        "(line 110,col 36)-(line 110,col 55)",
        "(line 111,col 9)-(line 111,col 50)",
        "(line 113,col 9)-(line 113,col 36)",
        "(line 115,col 9)-(line 115,col 32)",
        "(line 116,col 9)-(line 116,col 34)",
        "(line 117,col 9)-(line 117,col 43)",
        "(line 118,col 9)-(line 118,col 43)",
        "(line 119,col 9)-(line 119,col 43)",
        "(line 120,col 9)-(line 120,col 44)",
        "(line 121,col 9)-(line 121,col 44)",
        "(line 122,col 9)-(line 122,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeFormTest.testParameters()",
      "begin_line": 128,
      "end_line": 148,
      "comment": "\n     * Test of parameters for the polynomial.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 147,col 9)"
      ]
    }
  ]
}