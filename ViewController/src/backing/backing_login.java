package backing;

import oracle.adf.view.rich.component.rich.input.RichInputText;

public class backing_login {
    private RichInputText contraseña;

    public backing_login() {
    }

    public void setContraseña(RichInputText contraseña) {
        this.contraseña = contraseña;
    }

    public RichInputText getContraseña() {
        return contraseña;
    }
}
