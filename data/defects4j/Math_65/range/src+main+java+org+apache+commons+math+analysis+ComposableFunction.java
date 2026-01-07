{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/analysis/ComposableFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComposableFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction"
      ],
      "begin_line": 29,
      "end_line": 505,
      "comment": "\n * Base class for {@link UnivariateRealFunction} that can be composed with other functions.\n *\n * @since 2.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 32,
      "end_line": 38,
      "comment": " The constant function always returning 0. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-6a32633b-31db-4699-ab9d-68f4b2093d80.value(double)",
      "begin_line": 34,
      "end_line": 37,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 36,col 13)-(line 36,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 41,
      "end_line": 47,
      "comment": " The constant function always returning 1. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-01fc6684-44f1-4970-914e-64faebda363f.value(double)",
      "begin_line": 43,
      "end_line": 46,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 45,col 13)-(line 45,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "IDENTITY"
      ],
      "begin_line": 50,
      "end_line": 56,
      "comment": " The identity function. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-280c1419-fc22-4ae3-9989-a857cf788094.value(double)",
      "begin_line": 52,
      "end_line": 55,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 54,col 13)-(line 54,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ABS"
      ],
      "begin_line": 59,
      "end_line": 65,
      "comment": " The {@code Math.abs} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-3fa04943-7d8f-4e49-91bb-0deb1286315f.value(double)",
      "begin_line": 61,
      "end_line": 64,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 63,col 13)-(line 63,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NEGATE"
      ],
      "begin_line": 68,
      "end_line": 74,
      "comment": " The - operator wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-277c4d35-1233-46cf-8ae1-5399fc7d374b.value(double)",
      "begin_line": 70,
      "end_line": 73,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 72,col 13)-(line 72,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "INVERT"
      ],
      "begin_line": 77,
      "end_line": 83,
      "comment": " The invert operator wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-5d254f8c-efa0-42c0-bf5a-50d0f0c9ff8d.value(double)",
      "begin_line": 79,
      "end_line": 82,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 81,col 13)-(line 81,col 23)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SIN"
      ],
      "begin_line": 86,
      "end_line": 92,
      "comment": " The {@code Math.sin} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-edcc0719-3f53-4ce0-8ec9-99b2c6efa0d9.value(double)",
      "begin_line": 88,
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 13)-(line 90,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SQRT"
      ],
      "begin_line": 95,
      "end_line": 101,
      "comment": " The {@code Math.sqrt} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-c496d246-a37d-4e59-bcc1-000829b51ffe.value(double)",
      "begin_line": 97,
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 13)-(line 99,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SINH"
      ],
      "begin_line": 104,
      "end_line": 110,
      "comment": " The {@code Math.sinh} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-e70bab33-0b92-4ef6-a8a8-e3b1185a2027.value(double)",
      "begin_line": 106,
      "end_line": 109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EXP"
      ],
      "begin_line": 113,
      "end_line": 119,
      "comment": " The {@code Math.exp} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-f9e33b7e-a5e4-40f6-ba6c-5c87b47ecf9d.value(double)",
      "begin_line": 115,
      "end_line": 118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 13)-(line 117,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EXPM1"
      ],
      "begin_line": 122,
      "end_line": 128,
      "comment": " The {@code Math.expm1} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-bc46972f-1dbf-4d87-8e88-088b5b0068a6.value(double)",
      "begin_line": 124,
      "end_line": 127,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 126,col 13)-(line 126,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ASIN"
      ],
      "begin_line": 131,
      "end_line": 137,
      "comment": " The {@code Math.asin} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-b667eb4f-2512-44e7-bf3e-316919cf5cbd.value(double)",
      "begin_line": 133,
      "end_line": 136,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 135,col 13)-(line 135,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ATAN"
      ],
      "begin_line": 140,
      "end_line": 146,
      "comment": " The {@code Math.atan} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-1d4e3022-2a0c-4f9e-ac13-271fdd4cba1d.value(double)",
      "begin_line": 142,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 144,col 13)-(line 144,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "TAN"
      ],
      "begin_line": 149,
      "end_line": 155,
      "comment": " The {@code Math.tan} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-4a4efb3f-368d-4d8a-bbae-258e84c21bd7.value(double)",
      "begin_line": 151,
      "end_line": 154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 13)-(line 153,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "TANH"
      ],
      "begin_line": 158,
      "end_line": 164,
      "comment": " The {@code Math.tanh} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-18887a21-98e5-4cdc-98cc-dd657f8f8622.value(double)",
      "begin_line": 160,
      "end_line": 163,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 162,col 13)-(line 162,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "CBRT"
      ],
      "begin_line": 167,
      "end_line": 173,
      "comment": " The {@code Math.cbrt} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-3fe9b4de-e6e0-4f5f-b367-ef6e3c1c49a4.value(double)",
      "begin_line": 169,
      "end_line": 172,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 171,col 13)-(line 171,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "CEIL"
      ],
      "begin_line": 176,
      "end_line": 182,
      "comment": " The {@code Math.ceil} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-a6c97766-a784-4b32-b960-96a8aecf1fae.value(double)",
      "begin_line": 178,
      "end_line": 181,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 180,col 13)-(line 180,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "FLOOR"
      ],
      "begin_line": 185,
      "end_line": 191,
      "comment": " The {@code Math.floor} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-67464b1e-65d4-4c20-92b9-98da397ebaf3.value(double)",
      "begin_line": 187,
      "end_line": 190,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 189,col 13)-(line 189,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LOG"
      ],
      "begin_line": 194,
      "end_line": 200,
      "comment": " The {@code Math.log} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-b34ed1a8-7fb5-46e8-bc0d-65173cf962d3.value(double)",
      "begin_line": 196,
      "end_line": 199,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 198,col 13)-(line 198,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LOG10"
      ],
      "begin_line": 203,
      "end_line": 209,
      "comment": " The {@code Math.log10} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-19e411c4-aa7d-4708-9629-93bc9d58a063.value(double)",
      "begin_line": 205,
      "end_line": 208,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 207,col 13)-(line 207,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LOG1P"
      ],
      "begin_line": 212,
      "end_line": 217,
      "comment": " The {@code Math.log1p} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-3ab6ecea-7feb-4516-b849-32d1bfcb14c8.value(double)",
      "begin_line": 213,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 215,col 13)-(line 215,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "COS"
      ],
      "begin_line": 220,
      "end_line": 226,
      "comment": " The {@code Math.cos} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-3641bcc7-fd80-4f3e-98d9-550668557c27.value(double)",
      "begin_line": 222,
      "end_line": 225,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 224,col 13)-(line 224,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ACOS"
      ],
      "begin_line": 229,
      "end_line": 235,
      "comment": " The {@code Math.abs} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-70bbcd1e-fd14-4911-a121-b8d120bad56e.value(double)",
      "begin_line": 231,
      "end_line": 234,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 233,col 13)-(line 233,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "COSH"
      ],
      "begin_line": 238,
      "end_line": 244,
      "comment": " The {@code Math.cosh} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-65876e63-07ff-45fe-a241-f3f9f389ab9d.value(double)",
      "begin_line": 240,
      "end_line": 243,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 242,col 13)-(line 242,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "RINT"
      ],
      "begin_line": 247,
      "end_line": 253,
      "comment": " The {@code Math.rint} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-d558e67f-ca1b-4933-a0f4-db8e7f062dca.value(double)",
      "begin_line": 249,
      "end_line": 252,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 251,col 13)-(line 251,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SIGNUM"
      ],
      "begin_line": 256,
      "end_line": 262,
      "comment": " The {@code Math.signum} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-bdb7dd81-8d07-4bfb-95d2-fc02581217bf.value(double)",
      "begin_line": 258,
      "end_line": 261,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 260,col 13)-(line 260,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ULP"
      ],
      "begin_line": 265,
      "end_line": 271,
      "comment": " The {@code Math.ulp} method wrapped as a {@link ComposableFunction}. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-ef81cd06-c91c-4d36-865f-9f639ecc6876.value(double)",
      "begin_line": 267,
      "end_line": 270,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 269,col 13)-(line 269,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.of(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 282,
      "end_line": 290,
      "comment": " Precompose the instance with another function.\n     * \u003cp\u003e\n     * The composed function h created by {@code h \u003d g.of(f)} is such\n     * that {@code h.value(x) \u003d\u003d g.value(f.value(x))} for all x.\n     * \u003c/p\u003e\n     * @param f function to compose with\n     * @return a new function which computes {@code this.value(f.value(x))}\n     * @see #postCompose(UnivariateRealFunction)\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 289,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-69024651-0dd0-4ca3-ad53-235f6548846b.value(double)",
      "begin_line": 284,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 287,col 17)-(line 287,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.postCompose(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 301,
      "end_line": 309,
      "comment": " Postcompose the instance with another function.\n     * \u003cp\u003e\n     * The composed function h created by {@code h \u003d g.postCompose(f)} is such\n     * that {@code h.value(x) \u003d\u003d f.value(g.value(x))} for all x.\n     * \u003c/p\u003e\n     * @param f function to compose with\n     * @return a new function which computes {@code f.value(this.value(x))}\n     * @see #of(UnivariateRealFunction)\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 308,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-decc3c48-8c82-4ab4-8877-5145db4b3861.value(double)",
      "begin_line": 303,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 306,col 17)-(line 306,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.combine(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.analysis.BivariateRealFunction)",
      "begin_line": 321,
      "end_line": 330,
      "comment": "\n     * Return a function combining the instance and another function.\n     * \u003cp\u003e\n     * The function h created by {@code h \u003d g.combine(f, combiner)} is such that\n     * {@code h.value(x) \u003d\u003d combiner.value(g.value(x), f.value(x))} for all x.\n     * \u003c/p\u003e\n     * @param f function to combine with the instance\n     * @param combiner bivariate function used for combining\n     * @return a new function which computes {@code combine.value(this.value(x), f.value(x))}\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 329,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-20486506-7f90-4a54-9a38-73e50352d84e.value(double)",
      "begin_line": 324,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 327,col 17)-(line 327,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.add(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 337,
      "end_line": 345,
      "comment": "\n     * Return a function adding the instance and another function.\n     * @param f function to combine with the instance\n     * @return a new function which computes {@code this.value(x) + f.value(x)}\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 344,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-b7f3f7e6-6ac2-45a6-a301-fd40ea2a7755.value(double)",
      "begin_line": 339,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 342,col 17)-(line 342,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.add(double)",
      "begin_line": 352,
      "end_line": 360,
      "comment": "\n     * Return a function adding a constant term to the instance.\n     * @param a term to add\n     * @return a new function which computes {@code this.value(x) + a}\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 359,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-48e0ca0f-517b-43cf-a199-d00d430bf3d2.value(double)",
      "begin_line": 354,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 357,col 17)-(line 357,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.subtract(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 367,
      "end_line": 375,
      "comment": "\n     * Return a function subtracting another function from the instance.\n     * @param f function to combine with the instance\n     * @return a new function which computes {@code this.value(x) - f.value(x)}\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 374,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-2e1d499e-77f6-4fe8-9ece-6313709a96c5.value(double)",
      "begin_line": 369,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 372,col 17)-(line 372,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.multiply(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 382,
      "end_line": 390,
      "comment": "\n     * Return a function multiplying the instance and another function.\n     * @param f function to combine with the instance\n     * @return a new function which computes {@code this.value(x) * f.value(x)}\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 389,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-d586820d-38c3-4a6a-861e-bec9c4fcc2e5.value(double)",
      "begin_line": 384,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 387,col 17)-(line 387,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.multiply(double)",
      "begin_line": 397,
      "end_line": 405,
      "comment": "\n     * Return a function scaling the instance by a constant factor.\n     * @param scaleFactor constant scaling factor\n     * @return a new function which computes {@code this.value(x) * scaleFactor}\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 404,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-0d305b19-44a5-453d-bc34-37bcb1fb0545.value(double)",
      "begin_line": 399,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 402,col 17)-(line 402,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.divide(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 411,
      "end_line": 419,
      "comment": "\n     * Return a function dividing the instance by another function.\n     * @param f function to combine with the instance\n     * @return a new function which computes {@code this.value(x) / f.value(x)}\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 418,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-b22166f4-0c4d-459c-8d29-95b6691c349a.value(double)",
      "begin_line": 413,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 416,col 17)-(line 416,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.asCollector(org.apache.commons.math.analysis.BivariateRealFunction, double)",
      "begin_line": 438,
      "end_line": 451,
      "comment": "\n     * Generates a function that iteratively apply instance function on all\n     * elements of an array.\n     * \u003cp\u003e\n     * The generated function behaves as follows:\n     * \u003cul\u003e\n     *   \u003cli\u003einitialize result \u003d initialValue\u003c/li\u003e\n     *   \u003cli\u003eiterate: {@code result \u003d combiner.value(result,\n     *   this.value(nextMultivariateEntry));}\u003c/li\u003e\n     *   \u003cli\u003ereturn result\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param combiner combiner to use between entries\n     * @param initialValue initial value to use before first entry\n     * @return a new function that iteratively applie instance function on all\n     * elements of an array.\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 450,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-cf12f431-6649-4942-85c9-906d418f5a83.value(double[])",
      "begin_line": 442,
      "end_line": 449,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 444,col 17)-(line 444,col 45)",
        "(line 445,col 17)-(line 447,col 17)",
        "(line 448,col 17)-(line 448,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.asCollector(org.apache.commons.math.analysis.BivariateRealFunction)",
      "begin_line": 465,
      "end_line": 467,
      "comment": "\n     * Generates a function that iteratively apply instance function on all\n     * elements of an array.\n     * \u003cp\u003e\n     * Calling this method is equivalent to call {@link\n     * #asCollector(BivariateRealFunction, double) asCollector(BivariateRealFunction, 0.0)}.\n     * \u003c/p\u003e\n     * @param combiner combiner to use between entries\n     * @return a new function that iteratively applie instance function on all\n     * elements of an array.\n     * @see #asCollector(BivariateRealFunction, double)\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.asCollector(double)",
      "begin_line": 482,
      "end_line": 484,
      "comment": "\n     * Generates a function that iteratively apply instance function on all\n     * elements of an array.\n     * \u003cp\u003e\n     * Calling this method is equivalent to call {@link\n     * #asCollector(BivariateRealFunction, double) asCollector(BinaryFunction.ADD, initialValue)}.\n     * \u003c/p\u003e\n     * @param initialValue initial value to use before first entry\n     * @return a new function that iteratively applie instance function on all\n     * elements of an array.\n     * @see #asCollector(BivariateRealFunction, double)\n     * @see BinaryFunction#ADD\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.asCollector()",
      "begin_line": 498,
      "end_line": 500,
      "comment": "\n     * Generates a function that iteratively apply instance function on all\n     * elements of an array.\n     * \u003cp\u003e\n     * Calling this method is equivalent to call {@link\n     * #asCollector(BivariateRealFunction, double) asCollector(BinaryFunction.ADD, 0.0)}.\n     * \u003c/p\u003e\n     * @return a new function that iteratively applie instance function on all\n     * elements of an array.\n     * @see #asCollector(BivariateRealFunction, double)\n     * @see BinaryFunction#ADD\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.ComposableFunction.value(double)",
      "begin_line": 503,
      "end_line": 503,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}