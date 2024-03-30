public class TestDemo{

@Test
    public void shouldAddUser() throws Exception {
        User user = new User();
        user.setUsername("username");
        user.setPassword("password");
        user.setEnabled(true);
        user.addRole("OWNER_ADMIN");

        User user2 = new User();
        user2.setUsername("username");
        user2.setPassword("password");
        user2.setEnabled(true);
        user2.addRole("OWNER_ADMIN");

        userService.saveUser(user);
        assertThat(user.getName,user2.getName); 
        assertThat(user.getRoles, user2.getRolesName); 


    }
}