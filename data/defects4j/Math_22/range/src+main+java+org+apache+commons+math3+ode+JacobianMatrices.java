{
  "filepath": "/tmp/Math-22b/src/main/java/org/apache/commons/math3/ode/JacobianMatrices.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JacobianMatrices",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 496,
      "comment": "\n * This class defines a set of {@link SecondaryEquations secondary equations} to\n * compute the Jacobian matrices with respect to the initial state vector and, if\n * any, to some parameters of the primary ODE set.\n * \u003cp\u003e\n * It is intended to be packed into an {@link ExpandableStatefulODE}\n * in conjunction with a primary set of ODE, which may be:\n * \u003cul\u003e\n * \u003cli\u003ea {@link FirstOrderDifferentialEquations}\u003c/li\u003e\n * \u003cli\u003ea {@link MainStateJacobianProvider}\u003c/li\u003e\n * \u003c/ul\u003e\n * In order to compute Jacobian matrices with respect to some parameters of the\n * primary ODE set, the following parameter Jacobian providers may be set:\n * \u003cul\u003e\n * \u003cli\u003ea {@link ParameterJacobianProvider}\u003c/li\u003e\n * \u003cli\u003ea {@link ParameterizedODE}\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @see ExpandableStatefulODE\n * @see FirstOrderDifferentialEquations\n * @see MainStateJacobianProvider\n * @see ParameterJacobianProvider\n * @see ParameterizedODE\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "efode"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Expandable first order differential equation. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Index of the instance in the expandable set. "
    },
    {
      "type": "field",
      "varNames": [
        "jode"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " FODE with exact primary Jacobian computation skill. "
    },
    {
      "type": "field",
      "varNames": [
        "pode"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " FODE without exact parameter Jacobian computation skill. "
    },
    {
      "type": "field",
      "varNames": [
        "stateDim"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Main state vector dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "selectedParameters"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Selected parameters for parameter Jacobian computation. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobianProviders"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " FODE with exact parameter Jacobian computation skill. "
    },
    {
      "type": "field",
      "varNames": [
        "paramDim"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Parameters dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "dirtyParameter"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Boolean for selected parameters consistency. "
    },
    {
      "type": "field",
      "varNames": [
        "matricesData"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " State and parameters Jacobian matrices in a row. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.JacobianMatrices(org.apache.commons.math3.ode.FirstOrderDifferentialEquations, double[], java.lang.String...)",
      "begin_line": 105,
      "end_line": 109,
      "comment": " Simple constructor for a secondary equations set computing Jacobian matrices.\n     * \u003cp\u003e\n     * Parameters must belong to the supported ones given by {@link\n     * Parameterizable#getParametersNames()}, so the primary set of differential\n     * equations must be {@link Parameterizable}.\n     * \u003c/p\u003e\n     * \u003cp\u003eNote that each selection clears the previous selected parameters.\u003c/p\u003e\n     *\n     * @param fode the primary first order differential equations set to extend\n     * @param hY step used for finite difference computation with respect to state vector\n     * @param parameters parameters to consider for Jacobian matrices processing\n     * (may be null if parameters Jacobians is not desired)\n     * @exception DimensionMismatchException if there is a dimension mismatch between\n     * the steps array {@code hY} and the equation dimension\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.JacobianMatrices(org.apache.commons.math3.ode.MainStateJacobianProvider, java.lang.String...)",
      "begin_line": 123,
      "end_line": 155,
      "comment": " Simple constructor for a secondary equations set computing Jacobian matrices.\n     * \u003cp\u003e\n     * Parameters must belong to the supported ones given by {@link\n     * Parameterizable#getParametersNames()}, so the primary set of differential\n     * equations must be {@link Parameterizable}.\n     * \u003c/p\u003e\n     * \u003cp\u003eNote that each selection clears the previous selected parameters.\u003c/p\u003e\n     *\n     * @param jode the primary first order differential equations set to extend\n     * @param parameters parameters to consider for Jacobian matrices processing\n     * (may be null if parameters Jacobians is not desired)\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 26)",
        "(line 127,col 9)-(line 127,col 24)",
        "(line 129,col 9)-(line 129,col 25)",
        "(line 130,col 9)-(line 130,col 25)",
        "(line 132,col 9)-(line 132,col 44)",
        "(line 134,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 36)",
        "(line 146,col 9)-(line 146,col 76)",
        "(line 150,col 9)-(line 150,col 68)",
        "(line 151,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.registerVariationalEquations(org.apache.commons.math3.ode.ExpandableStatefulODE)",
      "begin_line": 165,
      "end_line": 180,
      "comment": " Register the variational equations for the Jacobians matrices to the expandable set.\n     * @param expandable expandable set into which variational equations should be registered\n     * @throws DimensionMismatchException if the dimension of the partial state does not\n     * match the selected equations set dimension\n     * @exception MismatchedEquations if the primary set of the expandable set does\n     * not match the one used to build the instance\n     * @see ExpandableStatefulODE#addSecondaryEquations(SecondaryEquations)\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 57)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 176,col 27)",
        "(line 177,col 9)-(line 177,col 79)",
        "(line 178,col 9)-(line 178,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.addParameterJacobianProvider(org.apache.commons.math3.ode.ParameterJacobianProvider)",
      "begin_line": 185,
      "end_line": 187,
      "comment": " Add a parameter Jacobian provider.\n     * @param provider the parameter Jacobian provider to compute exactly the parameter Jacobian matrix\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.setParameterizedODE(org.apache.commons.math3.ode.ParameterizedODE)",
      "begin_line": 192,
      "end_line": 195,
      "comment": " Set a parameter Jacobian provider.\n     * @param parameterizedOde the parameterized ODE to compute the parameter Jacobian matrix using finite differences\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 37)",
        "(line 194,col 9)-(line 194,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.setParameterStep(java.lang.String, double)",
      "begin_line": 214,
      "end_line": 227,
      "comment": " Set the step associated to a parameter in order to compute by finite\n     *  difference the Jacobian matrix.\n     * \u003cp\u003e\n     * Needed if and only if the primary ODE set is a {@link ParameterizedODE}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Given a non zero parameter value pval for the parameter, a reasonable value\n     * for such a step is {@code pval * FastMath.sqrt(Precision.EPSILON)}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * A zero value for such a step doesn\u0027t enable to compute the parameter Jacobian matrix.\n     * \u003c/p\u003e\n     * @param parameter parameter to consider for Jacobian processing\n     * @param hP step for Jacobian finite difference computation w.r.t. the specified parameter\n     * @see ParameterizedODE\n     * @exception UnknownParameterException if the parameter is not supported\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 225,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.setInitialMainStateJacobian(double[][])",
      "begin_line": 237,
      "end_line": 255,
      "comment": " Set the initial value of the Jacobian matrix with respect to state.\n     * \u003cp\u003e\n     * If this method is not called, the initial value of the Jacobian\n     * matrix with respect to state is set to identity.\n     * \u003c/p\u003e\n     * @param dYdY0 initial Jacobian matrix w.r.t. state\n     * @exception DimensionMismatchException if matrix dimensions are incorrect\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 40)",
        "(line 242,col 9)-(line 242,col 43)",
        "(line 245,col 9)-(line 245,col 18)",
        "(line 246,col 9)-(line 249,col 9)",
        "(line 251,col 9)-(line 253,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.setInitialParameterJacobian(java.lang.String, double[])",
      "begin_line": 267,
      "end_line": 288,
      "comment": " Set the initial value of a column of the Jacobian matrix with respect to one parameter.\n     * \u003cp\u003e\n     * If this method is not called for some parameter, the initial value of\n     * the column of the Jacobian matrix with respect to this parameter is set to zero.\n     * \u003c/p\u003e\n     * @param pName parameter name\n     * @param dYdP initial Jacobian column vector with respect to the parameter\n     * @exception UnknownParameterException if a parameter is not supported\n     * @throws DimensionMismatchException if the column vector does not match state dimension\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 39)",
        "(line 274,col 9)-(line 274,col 36)",
        "(line 275,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 286,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.getCurrentMainSetJacobian(double[][])",
      "begin_line": 293,
      "end_line": 304,
      "comment": " Get the current value of the Jacobian matrix with respect to state.\n     * @param dYdY0 current Jacobian matrix with respect to state.\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 52)",
        "(line 298,col 9)-(line 298,col 18)",
        "(line 299,col 9)-(line 302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.getCurrentParameterJacobian(java.lang.String, double[])",
      "begin_line": 310,
      "end_line": 324,
      "comment": " Get the current value of the Jacobian matrix with respect to one parameter.\n     * @param pName name of the parameter for the computed Jacobian matrix\n     * @param dYdP current Jacobian matrix with respect to the named parameter\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 52)",
        "(line 315,col 9)-(line 315,col 36)",
        "(line 316,col 9)-(line 322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.checkDimension(int, java.lang.Object)",
      "begin_line": 331,
      "end_line": 337,
      "comment": " Check array dimensions.\n     * @param expected expected dimension\n     * @param array (may be null if expected is 0)\n     * @throws DimensionMismatchException if the array dimension does not match the expected one\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 74)",
        "(line 334,col 9)-(line 336,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JacobiansSecondaryEquations",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.SecondaryEquations"
      ],
      "begin_line": 345,
      "end_line": 422,
      "comment": " Local implementation of secondary equations.\n     * \u003cp\u003e\n     * This class is an inner class to ensure proper scheduling of calls\n     * by forcing the use of {@link JacobianMatrices#registerVariationalEquations(ExpandableStatefulODE)}.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.JacobiansSecondaryEquations.getDimension()",
      "begin_line": 348,
      "end_line": 350,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 349,col 13)-(line 349,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.JacobiansSecondaryEquations.computeDerivatives(double, double[], double[], double[], double[])",
      "begin_line": 353,
      "end_line": 421,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 358,col 13)-(line 361,col 13)",
        "(line 367,col 13)-(line 367,col 61)",
        "(line 368,col 13)-(line 368,col 60)",
        "(line 371,col 13)-(line 383,col 13)",
        "(line 385,col 13)-(line 419,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MainStateJacobianWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.MainStateJacobianProvider"
      ],
      "begin_line": 427,
      "end_line": 481,
      "comment": " Wrapper class to compute jacobian matrices by finite differences for ODE\n     *  which do not compute them by themselves.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ode"
      ],
      "begin_line": 430,
      "end_line": 430,
      "comment": " Raw ODE without jacobians computation skill to be wrapped into a MainStateJacobianProvider. "
    },
    {
      "type": "field",
      "varNames": [
        "hY"
      ],
      "begin_line": 433,
      "end_line": 433,
      "comment": " Steps for finite difference computation of the jacobian df/dy w.r.t. state. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.MainStateJacobianWrapper.MainStateJacobianWrapper(org.apache.commons.math3.ode.FirstOrderDifferentialEquations, double[])",
      "begin_line": 442,
      "end_line": 450,
      "comment": " Wrap a {@link FirstOrderDifferentialEquations} into a {@link MainStateJacobianProvider}.\n         * @param ode original ODE problem, without jacobians computation skill\n         * @param hY step sizes to compute the jacobian df/dy\n         * @see JacobianMatrices#setMainStateSteps(double[])\n         * @exception DimensionMismatchException if there is a dimension mismatch between\n         * the steps array {@code hY} and the equation dimension\n         ",
      "child_ranges": [
        "(line 445,col 13)-(line 445,col 27)",
        "(line 446,col 13)-(line 446,col 33)",
        "(line 447,col 13)-(line 449,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.MainStateJacobianWrapper.getDimension()",
      "begin_line": 453,
      "end_line": 455,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 454,col 13)-(line 454,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.MainStateJacobianWrapper.computeDerivatives(double, double[], double[])",
      "begin_line": 458,
      "end_line": 461,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 460,col 13)-(line 460,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.MainStateJacobianWrapper.computeMainStateJacobian(double, double[], double[], double[][])",
      "begin_line": 464,
      "end_line": 479,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 467,col 13)-(line 467,col 45)",
        "(line 468,col 13)-(line 468,col 50)",
        "(line 470,col 13)-(line 478,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MismatchedEquations",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.MathIllegalArgumentException"
      ],
      "begin_line": 484,
      "end_line": 494,
      "comment": " Special exception for equations mismatch. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 487,
      "end_line": 487,
      "comment": " Serializable UID. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.MismatchedEquations.MismatchedEquations()",
      "begin_line": 490,
      "end_line": 492,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 491,col 13)-(line 491,col 66)"
      ]
    }
  ]
}