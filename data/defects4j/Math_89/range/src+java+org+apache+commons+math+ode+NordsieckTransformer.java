{
  "filepath": "/tmp/Math-89b/src/java/org/apache/commons/math/ode/NordsieckTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NordsieckTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 83,
      "end_line": 511,
      "comment": "\n * This class transforms state history between multistep (with or without\n * derivatives) and Nordsieck forms.\n * \u003cp\u003e\n * {@link MultistepIntegrator multistep integrators} use state history\n * from several previous steps to compute the current state. They may also use\n * the first derivative of current state. All states are separated by a fixed\n * step size h from each other. Since these methods are based on polynomial\n * interpolation, the information from the previous state may be represented\n * in another equivalent way: using the state higher order derivatives at\n * current step rather. This class transforms state history between these three\n * equivalent forms.\n * \u003cp\u003e\n * \u003cp\u003e\n * The supported forms for a dimension n history are:\n * \u003cul\u003e\n *   \u003cli\u003emultistep without derivatives:\u003cbr/\u003e\n *     \u003cpre\u003e\n *       y\u003csub\u003ek\u003c/sub\u003e, y\u003csub\u003ek-1\u003c/sub\u003e ... y\u003csub\u003ek-(n-2), y\u003csub\u003ek-(n-1)\u003c/sub\u003e\n *     \u003c/pre\u003e\n *   \u003c/li\u003e\n *   \u003cli\u003emultistep with first derivative at current step:\u003cbr/\u003e\n *     \u003cpre\u003e\n *       y\u003csub\u003ek\u003c/sub\u003e, y\u0027\u003csub\u003ek\u003c/sub\u003e, y\u003csub\u003ek-1\u003c/sub\u003e ... y\u003csub\u003ek-(n-2)\u003c/sub\u003e\n *     \u003c/pre\u003e\n *   \u003c/li\u003e\n *   \u003cli\u003eNordsieck:\n *     \u003cpre\u003e\n *       y\u003csub\u003ek\u003c/sub\u003e, h y\u0027\u003csub\u003ek\u003c/sub\u003e, h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027\u003csub\u003ek\u003c/sub\u003e ... h\u003csup\u003en-1\u003c/sup\u003e/(n-1)! yn-1\u003csub\u003ek\u003c/sub\u003e\n *     \u003c/pre\u003e\n *   \u003c/li\u003e\n * \u003c/ul\u003e \n * In these expressions, y\u003csub\u003ek\u003c/sub\u003e is the state at the current step. For each p,\n * y\u003csub\u003ek-p\u003c/sub\u003e is the state at the p\u003csup\u003eth\u003c/sup\u003e previous step. y\u0027\u003csub\u003ek\u003c/sub\u003e,\n * y\u0027\u0027\u003csub\u003ek\u003c/sub\u003e ... yn-1\u003csub\u003ek\u003c/sub\u003e are respectively the first, second, ...\n * (n-1)\u003csup\u003eth\u003c/sup\u003e derivatives of the state at current step and h is the fixed\n * step size.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The transforms are exact for polynomials.\n * \u003c/p\u003e\n * \u003cp\u003e\n * In Nordsieck form, the state history can be converted from step size h to step\n * size h\u0027 by rescaling each component by 1, h\u0027/h, (h\u0027/h)\u003csup\u003e2\u003c/sup\u003e ...\n * (h\u0027/h)\u003csup\u003en-1\u003c/sup\u003e.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Instances of this class are guaranteed to be immutable.\n * \u003c/p\u003e\n * @see org.apache.commons.math.ode.MultistepIntegrator\n * @see org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator\n * @see org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "matNtoMWD"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Nordsieck to Multistep  without derivatives matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "matMWDtoN"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Multistep without derivatives to Nordsieck matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "matNtoM"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Nordsieck to Multistep matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "matMtoN"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Multistep to Nordsieck matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.NordsieckTransformer.NordsieckTransformer(int)",
      "begin_line": 104,
      "end_line": 154,
      "comment": "\n     * Build a transformer for a specified order.\n     * @param n dimension of the history\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 88)",
        "(line 108,col 9)-(line 108,col 49)",
        "(line 109,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 58)",
        "(line 119,col 9)-(line 119,col 86)",
        "(line 120,col 9)-(line 120,col 49)",
        "(line 121,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 58)",
        "(line 131,col 9)-(line 131,col 68)",
        "(line 132,col 9)-(line 132,col 47)",
        "(line 133,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 54)",
        "(line 143,col 9)-(line 143,col 34)",
        "(line 144,col 9)-(line 144,col 47)",
        "(line 145,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.NordsieckTransformer.buildNordsieckToMultistepWithoutDerivatives(int)",
      "begin_line": 161,
      "end_line": 187,
      "comment": "\n     * Build the transform from Nordsieck to multistep without derivatives.\n     * @param n dimension of the history\n     * @return transform from Nordsieck to multistep without derivatives\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 58)",
        "(line 166,col 9)-(line 166,col 37)",
        "(line 167,col 9)-(line 167,col 53)",
        "(line 175,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 185,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.NordsieckTransformer.buildMultistepWithoutDerivativesToNordsieck(int)",
      "begin_line": 194,
      "end_line": 267,
      "comment": "\n     * Build the transform from multistep without derivatives to Nordsieck.\n     * @param n dimension of the history\n     * @return transform from multistep without derivatives to Nordsieck\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 59)",
        "(line 199,col 9)-(line 199,col 38)",
        "(line 200,col 9)-(line 200,col 54)",
        "(line 220,col 9)-(line 250,col 9)",
        "(line 253,col 9)-(line 253,col 50)",
        "(line 254,col 9)-(line 254,col 61)",
        "(line 255,col 9)-(line 263,col 9)",
        "(line 265,col 9)-(line 265,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.NordsieckTransformer.buildNordsieckToMultistep(int)",
      "begin_line": 274,
      "end_line": 309,
      "comment": "\n     * Build the transform from Nordsieck to multistep.\n     * @param n dimension of the history\n     * @return transform from Nordsieck to multistep\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 58)",
        "(line 279,col 9)-(line 279,col 37)",
        "(line 280,col 9)-(line 280,col 53)",
        "(line 282,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 307,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.NordsieckTransformer.buildMultistepToNordsieck(int)",
      "begin_line": 316,
      "end_line": 320,
      "comment": "\n     * Build the transform from multistep to Nordsieck.\n     * @param n dimension of the history\n     * @return transform from multistep to Nordsieck\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 85)",
        "(line 318,col 9)-(line 318,col 33)",
        "(line 319,col 9)-(line 319,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.NordsieckTransformer.convertMWDtNtoMtN(org.apache.commons.math.fraction.BigFraction[][])",
      "begin_line": 329,
      "end_line": 361,
      "comment": "\n     * Convert a transform from multistep without derivatives to Nordsieck to\n     * multistep to Nordsieck.\n     * @param work array, contains tansform from multistep without derivatives\n     * to Nordsieck on input, will be overwritten with tansform from multistep\n     * to Nordsieck on output\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 35)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 340,col 9)-(line 340,col 49)",
        "(line 341,col 9)-(line 341,col 59)",
        "(line 342,col 9)-(line 342,col 69)",
        "(line 343,col 9)-(line 343,col 45)",
        "(line 344,col 9)-(line 344,col 31)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 351,col 9)-(line 359,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.NordsieckTransformer.multistepToNordsieck(double[])",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\n     * Transform a scalar state history from multistep form to Nordsieck form.\n     * \u003cp\u003e\n     * The input state history must be in multistep form with element 0 for\n     * current state, element 1 for current state scaled first derivative, element\n     * 2 for previous state ... element n-1 for (n-2)\u003csup\u003eth\u003c/sup\u003e previous state.\n     * The output state history will be in Nordsieck form with element 0 for\n     * current state, element 1 for current state scaled first derivative, element\n     * 2 for current state scaled second derivative ... element n-1 for current state\n     * scaled (n-1)\u003csup\u003eth\u003c/sup\u003e derivative.\n     * \u003c/p\u003e\n     * @param multistepHistory scalar state history in multistep form\n     * @return scalar state history in Nordsieck form\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.NordsieckTransformer.multistepToNordsieck(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\n     * Transform a vectorial state history from multistep form to Nordsieck form.\n     * \u003cp\u003e\n     * The input state history must be in multistep form with row 0 for\n     * current state, row 1 for current state scaled first derivative, row\n     * 2 for previous state ... row n-1 for (n-2)\u003csup\u003eth\u003c/sup\u003e previous state.\n     * The output state history will be in Nordsieck form with row 0 for\n     * current state, row 1 for current state scaled first derivative, row\n     * 2 for current state scaled second derivative ... row n-1 for current state\n     * scaled (n-1)\u003csup\u003eth\u003c/sup\u003e derivative.\n     * \u003c/p\u003e\n     * @param multistepHistory vectorial state history in multistep form\n     * @return vectorial state history in Nordsieck form\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.NordsieckTransformer.nordsieckToMultistep(double[])",
      "begin_line": 413,
      "end_line": 415,
      "comment": "\n     * Transform a scalar state history from Nordsieck form to multistep form.\n     * \u003cp\u003e\n     * The input state history must be in Nordsieck form with element 0 for\n     * current state, element 1 for current state scaled first derivative, element\n     * 2 for current state scaled second derivative ... element n-1 for current state\n     * scaled (n-1)\u003csup\u003eth\u003c/sup\u003e derivative.\n     * The output state history will be in multistep form with element 0 for\n     * current state, element 1 for current state scaled first derivative, element\n     * 2 for previous state ... element n-1 for (n-2)\u003csup\u003eth\u003c/sup\u003e previous state.\n     * \u003c/p\u003e\n     * @param nordsieckHistory scalar state history in Nordsieck form\n     * @return scalar state history in multistep form\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.NordsieckTransformer.nordsieckToMultistep(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 431,
      "end_line": 433,
      "comment": "\n     * Transform a vectorial state history from Nordsieck form to multistep form.\n     * \u003cp\u003e\n     * The input state history must be in Nordsieck form with row 0 for\n     * current state, row 1 for current state scaled first derivative, row\n     * 2 for current state scaled second derivative ... row n-1 for current state\n     * scaled (n-1)\u003csup\u003eth\u003c/sup\u003e derivative.\n     * The output state history will be in multistep form with row 0 for\n     * current state, row 1 for current state scaled first derivative, row\n     * 2 for previous state ... row n-1 for (n-2)\u003csup\u003eth\u003c/sup\u003e previous state.\n     * \u003c/p\u003e\n     * @param nordsieckHistory vectorial state history in Nordsieck form\n     * @return vectorial state history in multistep form\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.NordsieckTransformer.multistepWithoutDerivativesToNordsieck(double[])",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\n     * Transform a scalar state history from multistep without derivatives form\n     * to Nordsieck form.\n     * \u003cp\u003e\n     * The input state history must be in multistep without derivatives form with\n     * element 0 for current state, element 1 for previous state ... element n-1\n     * for (n-1)\u003csup\u003eth\u003c/sup\u003e previous state.\n     * The output state history will be in Nordsieck form with element 0 for\n     * current state, element 1 for current state scaled first derivative, element\n     * 2 for current state scaled second derivative ... element n-1 for current state\n     * scaled (n-1)\u003csup\u003eth\u003c/sup\u003e derivative.\n     * \u003c/p\u003e\n     * @param mwdHistory scalar state history in multistep without derivatives form\n     * @return scalar state history in Nordsieck form\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.NordsieckTransformer.multistepWithoutDerivativesToNordsieck(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 469,
      "end_line": 471,
      "comment": "\n     * Transform a vectorial state history from multistep without derivatives form\n     * to Nordsieck form.\n     * \u003cp\u003e\n     * The input state history must be in multistep without derivatives form with\n     * row 0 for current state, row 1 for previous state ... row n-1\n     * for (n-1)\u003csup\u003eth\u003c/sup\u003e previous state.\n     * The output state history will be in Nordsieck form with row 0 for\n     * current state, row 1 for current state scaled first derivative, row\n     * 2 for current state scaled second derivative ... row n-1 for current state\n     * scaled (n-1)\u003csup\u003eth\u003c/sup\u003e derivative.\n     * \u003c/p\u003e\n     * @param mwdHistory vectorial state history in multistep without derivatives form\n     * @return vectorial state history in Nordsieck form\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.NordsieckTransformer.nordsieckToMultistepWithoutDerivatives(double[])",
      "begin_line": 488,
      "end_line": 490,
      "comment": "\n     * Transform a scalar state history from Nordsieck form to multistep without\n     * derivatives form.\n     * \u003cp\u003e\n     * The input state history must be in Nordsieck form with element 0 for\n     * current state, element 1 for current state scaled first derivative, element\n     * 2 for current state scaled second derivative ... element n-1 for current state\n     * scaled (n-1)\u003csup\u003eth\u003c/sup\u003e derivative.\n     * The output state history will be in multistep without derivatives form with\n     * element 0 for current state, element 1 for previous state ... element n-1\n     * for (n-1)\u003csup\u003eth\u003c/sup\u003e previous state.\n     * \u003c/p\u003e\n     * @param nordsieckHistory scalar state history in Nordsieck form\n     * @return scalar state history in multistep without derivatives form\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.NordsieckTransformer.nordsieckToMultistepWithoutDerivatives(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 507,
      "end_line": 509,
      "comment": "\n     * Transform a vectorial state history from Nordsieck form to multistep without\n     * derivatives form.\n     * \u003cp\u003e\n     * The input state history must be in Nordsieck form with row 0 for\n     * current state, row 1 for current state scaled first derivative, row\n     * 2 for current state scaled second derivative ... row n-1 for current state\n     * scaled (n-1)\u003csup\u003eth\u003c/sup\u003e derivative.\n     * The output state history will be in multistep without derivatives form with\n     * row 0 for current state, row 1 for previous state ... row n-1\n     * for (n-1)\u003csup\u003eth\u003c/sup\u003e previous state.\n     * \u003c/p\u003e\n     * @param nordsieckHistory vectorial state history in Nordsieck form\n     * @return vectorial state history in multistep without derivatives form\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 52)"
      ]
    }
  ]
}