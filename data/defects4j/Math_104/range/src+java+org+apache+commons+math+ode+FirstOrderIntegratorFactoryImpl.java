{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/ode/FirstOrderIntegratorFactoryImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FirstOrderIntegratorFactoryImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderIntegratorFactory"
      ],
      "begin_line": 25,
      "end_line": 278,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * integrators.\n *  \n * @version $Revision: 480440 $ $Date: 2006-11-29 08:14:12 +0100 (mer., 29 nov. 2006) $\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactoryImpl.newDefaultFixedStepsizeIntegrator(double)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "\n     * Create a new fixed stepsize {@link FirstOrderIntegrator}.\n     * This factory buid a {@link ClassicalRungeKuttaIntegrator\n     * classical Runge-Kutta} integrator by default.\n     * @param step the fixed stepsize.\n     * @return the new fixed step integrator\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactoryImpl.newDefaultAdaptiveStepsizeIntegrator(double, double, double, double)",
      "begin_line": 51,
      "end_line": 56,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * This factory buid a {@link DormandPrince853Integrator\n     * Dormand-Prince 8(5,3)} integrator by default.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 55,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactoryImpl.newDefaultAdaptiveStepsizeIntegrator(double, double, double[], double[])",
      "begin_line": 70,
      "end_line": 75,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * This factory buid a {@link DormandPrince853Integrator\n     * Dormand-Prince 8(5,3)} integrator by default.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 74,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactoryImpl.newEulerIntegrator(double)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Create a new fixed stepsize {@link FirstOrderIntegrator}.\n     * This factory buid a {@link EulerIntegrator Euler} integrator.\n     * @param step the fixed stepsize.\n     * @return the new fixed step integrator\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactoryImpl.newMidpointIntegrator(double)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Create a new fixed stepsize {@link FirstOrderIntegrator}.\n     * This factory buid a {@link MidpointIntegrator midpoint} integrator.\n     * @param step the fixed stepsize.\n     * @return the new fixed step integrator\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactoryImpl.newClassicalRungeKuttaIntegrator(double)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactoryImpl.newGillIntegrator(double)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Create a new fixed stepsize {@link FirstOrderIntegrator}.\n     * This factory buid a {@link GillIntegrator Gill} integrator.\n     * @param step the fixed stepsize.\n     * @return the new fixed step integrator\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactoryImpl.newThreeEighthesIntegrator(double)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Create a new fixed stepsize {@link FirstOrderIntegrator}.\n     * This factory buid a {@link ThreeEighthesIntegrator 3/8} integrator.\n     * @param step the fixed stepsize.\n     * @return the new fixed step integrator\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactoryImpl.newHighamHall54Integrator(double, double, double, double)",
      "begin_line": 139,
      "end_line": 144,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * This factory buid a {@link HighamHall54Integrator Higham-Hall} integrator.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 143,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactoryImpl.newHighamHall54Integrator(double, double, double[], double[])",
      "begin_line": 157,
      "end_line": 162,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * This factory buid a {@link HighamHall54Integrator Higham-Hall} integrator.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 161,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactoryImpl.newDormandPrince54Integrator(double, double, double, double)",
      "begin_line": 176,
      "end_line": 181,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * This factory buid a {@link DormandPrince54Integrator\n     * Dormand-Prince 5(4)} integrator.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 180,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactoryImpl.newDormandPrince54Integrator(double, double, double[], double[])",
      "begin_line": 195,
      "end_line": 200,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * This factory buid a {@link DormandPrince54Integrator\n     * Dormand-Prince 5(4)} integrator.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 199,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactoryImpl.newDormandPrince853Integrator(double, double, double, double)",
      "begin_line": 214,
      "end_line": 219,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * This factory buid a {@link DormandPrince853Integrator\n     * Dormand-Prince 8(5,3)} integrator.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 218,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactoryImpl.newDormandPrince853Integrator(double, double, double[], double[])",
      "begin_line": 233,
      "end_line": 238,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * This factory buid a {@link DormandPrince853Integrator\n     * Dormand-Prince 8(5,3)} integrator.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 237,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactoryImpl.newGraggBulirschStoerIntegrator(double, double, double, double)",
      "begin_line": 252,
      "end_line": 257,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * This factory buid a {@link GraggBulirschStoerIntegrator\n     * Gragg-Bulirsch-Stoer} integrator.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 256,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegratorFactoryImpl.newGraggBulirschStoerIntegrator(double, double, double[], double[])",
      "begin_line": 271,
      "end_line": 276,
      "comment": "\n     * Create a new {@link AdaptiveStepsizeIntegrator}.\n     * This factory buid a {@link GraggBulirschStoerIntegrator\n     * Gragg-Bulirsch-Stoer} integrator.\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     * @return the new adaptive stepsize integrator\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 275,col 60)"
      ]
    }
  ]
}