package sz.iecas.model;

public class PermissionKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.role_id
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.action_id
     *
     * @mbggenerated
     */
    private Integer actionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.role_id
     *
     * @return the value of permission.role_id
     *
     * @mbggenerated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.role_id
     *
     * @param roleId the value for permission.role_id
     *
     * @mbggenerated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.action_id
     *
     * @return the value of permission.action_id
     *
     * @mbggenerated
     */
    public Integer getActionId() {
        return actionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.action_id
     *
     * @param actionId the value for permission.action_id
     *
     * @mbggenerated
     */
    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }
}