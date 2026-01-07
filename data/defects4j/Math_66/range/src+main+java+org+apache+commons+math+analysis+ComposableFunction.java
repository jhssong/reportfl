{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/analysis/ComposableFunction.java",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-53e08d44-96f1-4427-8904-ec408729cf9f.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-15c1396e-65ca-4658-9432-a8152252a3e7.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-84176c85-0009-4584-aaf9-6966086b4785.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-3ce46c7d-a386-4d38-8ef0-0e2f8f341680.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-6d6371de-a250-4b3a-97c6-3328aab80558.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-d193df0b-5971-4e74-922a-c6a71d08193d.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-c49c2fef-22ae-42ac-bc40-10a558091138.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-abf16527-5ee9-4cb9-845c-64a2f3a27232.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-74f63ec5-2cd5-46af-9fe9-a6a0f3beda16.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-9c7c57f7-13d1-42a7-9841-fd79e715a285.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-2832da40-058e-4c26-aa5a-60274fb31447.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-5c27a02c-9d5b-4756-9694-8b7e774abf1c.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-14cc5e8d-d202-46f9-9ca9-502f9168827c.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-038cb9ea-834c-40d0-ba8f-0f517189b0ff.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-e194c1ac-b7b8-421c-9d6c-e53c03092566.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-a84ee7ab-4304-4250-a53b-710c2a4fc653.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-406d3f71-ac05-4d3f-853c-9978827432e8.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-b7762ac3-445d-465f-8adf-87e0abca27dd.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-4093355b-103a-434c-a312-89f0db6d7627.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-8f1297ce-47b3-40d5-83de-afabb19eec74.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-cb778f5a-e553-47b2-9c20-513645cd43c2.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-a12112da-1c81-4b51-a7a1-3862e97640f4.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-723dbac2-ed1a-4930-a772-a97673798dff.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-8f7914c3-f942-4e91-884d-3f1d948d92dd.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-2553ed62-7091-4759-8c7d-8ac8b0a2b8af.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-86eb5c46-14ab-4058-bff3-37336cb889ec.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-dfaf457a-dd49-4cf9-bdb9-aca51166b2f4.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-1ef90bf2-3cba-4042-83ab-9b134c26621c.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-b16e105e-32c4-4e9a-b24c-ecd557aef6b2.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-0191fedd-df68-432a-83b0-1423ce6c62a4.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-c0293061-22b6-4719-8fec-a810cf88b066.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-6f169081-abfa-43a4-8424-93c5a9909803.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-6ad30ec5-14d0-4bd4-8d34-b99cdee7393d.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-6ebc43e5-da45-46eb-8492-e466afd8868b.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-6d9fab35-0e32-4955-90ef-d5a5bd52407e.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-ae192c75-fb7f-41e8-b8fb-777bcdf08f55.value(double)",
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
      "signature": "org.apache.commons.math.analysis.ComposableFunction.Anonymous-c4eb1acb-b957-4c24-841c-20204b6e937d.value(double[])",
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