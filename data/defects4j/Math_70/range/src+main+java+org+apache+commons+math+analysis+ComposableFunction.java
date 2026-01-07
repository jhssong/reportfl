{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/analysis/ComposableFunction.java",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-d04ccbe2-1955-4954-9b0a-6d6e98f99bb0.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-cc1e3043-f071-4f43-a9b3-50542c891c89.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-85063d80-6e05-44b6-9743-4039a601eeca.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-5889ef07-9dcc-48a1-aa92-3d5fcd5e6a92.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-77c9dada-717e-4b9c-b83f-4f02881316b4.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-3443b420-a53d-4691-a105-1bf3b4e40214.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-f8104a58-0b3f-4c8f-85c9-14369cfd49dc.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-6938ed3a-a7d5-46a3-82b2-b923a8868e2c.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-b54806a6-5a58-4525-920d-76427edae5ea.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-75e1ad20-181c-4787-8eea-1e68257703f9.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-fed6f542-ff92-4538-986e-6a3f5c718b47.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-69335130-c7ac-4e83-95e6-ee52f0c322f6.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-754c8811-7a61-4f93-8afc-ce86f46c50c2.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-df707354-7079-4148-98a4-3844f49a6166.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-fad151fd-6e0d-41d9-ba05-10c4193d0348.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-eede0070-8103-44ca-9c54-399294c5544b.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-c531064b-0b9f-4a85-b738-b5540afbad47.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-05ad5592-b494-47c8-8e27-86fc4b458229.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-19df6431-e1f8-44f6-a748-05cc2a211c25.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-4da37d81-1264-449c-85ad-c9983d3e9da4.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-3d115de3-d503-4d4c-8dec-4a4f45cd1d7c.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-2c1a1056-a9ce-499f-937e-74a0c9c29ddf.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-b818a73a-8ba0-40f7-8136-3a129d5cd840.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-6703299f-5f97-4eee-a7c3-dbc0dee9f071.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-6cd5e7d7-581a-4de2-8cb6-071f3f5e1412.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-b8923682-efc6-4b79-a3a9-9d3037687449.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-42774b26-f9ba-48d5-ab34-036eec015458.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-13a972eb-42e7-48cf-97fb-6e6e631e2240.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-c5d193f1-452e-4006-97d3-2e5bc36033b2.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-3fecb642-6d53-4174-8251-dd4e6ee44411.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-0a57cfc2-2b38-4a3f-9f0d-e75ff651593c.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-49c7fe45-c5df-4dc8-9f29-f67c25892049.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-907945f5-92b7-4ebb-a367-e278829442de.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-69e16f4f-0cef-420a-999e-f96729a478b7.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-24034aef-d100-42c2-a8ef-25ae01c8fd08.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-38d1750c-2118-49ee-9ef1-702116af01d0.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-af45d9cd-8e3a-4158-b61a-7c55dee385fe.value(double[])",
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